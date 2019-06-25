package br.gov.rn.saogoncalo.tributacaoapi.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Override //configurações do cliente
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("AngularUI") //nome do cliente solicitante
                .scopes("read", "write") //tipos de permissão
                .secret("$2a$10$/fYBJKxt1yb2WajIM87lHecFlMOLTgf.W.7uI/8o2kdzU5wotlZOW")//senha do cliente solicitante
                .authorizedGrantTypes("password") //tipo de token
                .accessTokenValiditySeconds(600); //tempo para expiração do token
    }

    @Override // configurações do token
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.authenticationManager(authenticationManager)
                .tokenStore(tokenStore());
    }

    @Bean //tipo bean gerenciado pelo Spring, obrigatoriamente deve ser público
    public TokenStore tokenStore() {
        return new InMemoryTokenStore();
    }


    // configurações de segurança
//    @Override
//    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
//        super.configure(security);

//    }
}

CREATE TABLE tb_convidados(
	con_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	con_nome VARCHAR(50) NOT NULL,
	con_fone VARCHAR(20) NOT NULL,
	con_email VARCHAR(50)
) ENGINE=InnoDB DEFAULT charset=utf8;

INSERT INTO tb_convidados 
	(con_nome, con_fone, con_email) 
VALUES 
	('Weskley Bezerra', '(84)99675-3679', 'weskleymb@hotmail.com'),
	('Miguel Barbosa', '(84) 99657-4618', 'miguelbarbosa1309@gmail.com'),
	('Lindson Lima', '(84) 98632-6467', NULL),
	('Paula Souza', '(84) 99819-2228', 'paulathaylanesenai@gmail.com');

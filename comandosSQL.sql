/* Criação da Tabela */
CREATE TABLE pessoas (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    comentario VARCHAR(255)
);

/* Inserindo dados no banco de dados/tabela */
INSERT INTO pessoas (nome, comentario) VALUES
('Ana', 'Eu amei esse novo produto!'),
('Bruno', 'O atendimento foi pessimo.'),
('Carla', 'Achei o serviço ok, nada demais.'),
('Diego', 'O aplicativo é muito bom e rápido.'),
('Eduarda', 'Não gostei, tive muitos problemas.');

/* Query select */
SELECT * FROM pessoas;
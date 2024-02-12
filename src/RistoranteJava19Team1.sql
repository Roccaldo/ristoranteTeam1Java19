CREATE TABLE menu(
id INT PRIMARY KEY,
nome_menu VARCHAR(255),
tipo_menu VARCHAR(255),
ristorante_id INT
);

CREATE TABLE antipasti(
id INT PRIMARY KEY,
nome VARCHAR(255),
prezzo DECIMAL(10,2),
menu_id INT
);

CREATE TABLE primi(
id INT PRIMARY KEY,
nome VARCHAR(255),
prezzo DECIMAL(10,2),
menu_id INT
);

CREATE TABLE secondi(
id INT PRIMARY KEY,
nome VARCHAR(255),
prezzo DECIMAL(10,2),
menu_id INT
);

CREATE TABLE contorni(
id INT PRIMARY KEY,
nome VARCHAR(255),
prezzo DECIMAL(10,2),
menu_id INT
);

CREATE TABLE dessert(
id INT PRIMARY KEY,
nome VARCHAR(255),
prezzo DECIMAL(10,2),
menu_id INT
);

CREATE TABLE bibite(
id INT PRIMARY KEY,
nome VARCHAR(255),
prezzo DECIMAL(10,2),
menu_id INT
);

CREATE TABLE pizze(
id INT PRIMARY KEY,
nome VARCHAR(255),
prezzo DECIMAL(10,2),
menu_id INT
);

CREATE TABLE ingredienti(
id INT AUTO_INCREMENT PRIMARY KEY,
nome_ingrediente VARCHAR(255)
);

CREATE TABLE allergeni(
id INT AUTO_INCREMENT PRIMARY KEY,
nome_allergene VARCHAR(255)
);

CREATE TABLE pizzaIngredienti(
id_pizza INT,
id_ingrediente INT
);

CREATE TABLE portataAllergeni(
id_portata INT,
id_allergene INT
);

CREATE TABLE Ristorante (
id INT PRIMARY KEY AUTO_INCREMENT,
nome_ristorante VARCHAR (255),
indirizzo VARCHAR (255),
max_posti INT
);

CREATE TABLE Prenotazione (
id INT PRIMARY KEY AUTO_INCREMENT,
nome_cliente VARCHAR (255),
coperti INT,
orario DATETIME,
id_cliente INT,
id_ristorante INT
);

CREATE TABLE Cliente (
id INT PRIMARY KEY AUTO_INCREMENT,
nome_menu VARCHAR (255),
tipo_menu VARCHAR (255)
);

CREATE TABLE Calorie (
id INT PRIMARY KEY AUTO_INCREMENT,
livello_calorie VARCHAR (255)
);

CREATE TABLE tipoCottura(
id INT AUTO_INCREMENT PRIMARY KEY,
nome_tipoCottura VARCHAR(255)
);

CREATE TABLE tipoPasta(
id INT AUTO_INCREMENT PRIMARY KEY,
nome_tipoPasta VARCHAR(255)
);

CREATE TABLE tipoImpasto(
id INT AUTO_INCREMENT PRIMARY KEY,
nome_tipoImpasto VARCHAR(255)
);

CREATE TABLE statoRistorante(
id INT AUTO_INCREMENT PRIMARY KEY,
stato VARCHAR(255)
);

ALTER TABLE menu
ADD CONSTRAINT FK_MenuRistorante
FOREIGN KEY(ristorante_id) REFERENCES ristorante(id);

ALTER TABLE prenotazione
ADD CONSTRAINT FK_PrenotazioneRistorante
FOREIGN KEY(id_ristorante) REFERENCES prenotazione(id);

ALTER TABLE prenotazione
ADD CONSTRAINT FK_PrenotazioneCliente
FOREIGN KEY(id_cliente) REFERENCES cliente(id);

ALTER TABLE antipasti
ADD CONSTRAINT FK_AntipastiMenu
FOREIGN KEY(menu_id) REFERENCES menu(id);

ALTER TABLE primi
ADD CONSTRAINT FK_PrimiMenu
FOREIGN KEY(menu_id) REFERENCES menu(id);

ALTER TABLE secondi
ADD CONSTRAINT FK_SecondiMenu
FOREIGN KEY(menu_id) REFERENCES menu(id);

ALTER TABLE contorni
ADD CONSTRAINT FK_ContornoMenu
FOREIGN KEY(menu_id) REFERENCES menu(id);

ALTER TABLE dessert
ADD CONSTRAINT FK_DessertMenu
FOREIGN KEY(menu_id) REFERENCES menu(id);

ALTER TABLE bibite
ADD CONSTRAINT FK_BibiteMenu
FOREIGN KEY(menu_id) REFERENCES menu(id);

ALTER TABLE pizze
ADD CONSTRAINT FK_PizzaMenu
FOREIGN KEY(menu_id) REFERENCES menu(id);

ALTER TABLE pizzaingredienti
ADD CONSTRAINT FK_Pizza
FOREIGN KEY(id_pizza) REFERENCES pizze(id);

ALTER TABLE pizzaingredienti
ADD CONSTRAINT FK_Ingredienti
FOREIGN KEY(id_pizza) REFERENCES ingredienti(id);

ALTER TABLE portataallergeni
ADD CONSTRAINT FK_Antipasto
FOREIGN KEY(id_portata) REFERENCES antipasti(id);

ALTER TABLE portataallergeni
ADD CONSTRAINT FK_Primo
FOREIGN KEY(id_portata) REFERENCES primi(id);

ALTER TABLE portataallergeni
ADD CONSTRAINT FK_Secondi
FOREIGN KEY(id_portata) REFERENCES secondi(id);

ALTER TABLE portataallergeni
ADD CONSTRAINT FK_Contorni
FOREIGN KEY(id_portata) REFERENCES contorni(id);

ALTER TABLE portataallergeni
ADD CONSTRAINT FK_Dessert
FOREIGN KEY(id_portata) REFERENCES dessert(id);

ALTER TABLE portataallergeni
ADD CONSTRAINT FK_Bibite
FOREIGN KEY(id_portata) REFERENCES bibite(id);

ALTER TABLE portataallergeni
ADD CONSTRAINT FK_Pizze
FOREIGN KEY(id_portata) REFERENCES pizze(id);

ALTER TABLE portataallergeni
ADD CONSTRAINT FK_Allergene
FOREIGN KEY(id_allergene) REFERENCES allergeni(id);
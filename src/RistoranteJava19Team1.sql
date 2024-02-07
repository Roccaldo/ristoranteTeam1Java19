CREATE TABLE menu(
id INT AUTO_INCREMENT PRIMARY KEY,
nome_menu VARCHAR(255),
tipo_menu INT,
ristorante_id INT
);

CREATE TABLE tipoMenu(
id INT AUTO_INCREMENT PRIMARY KEY,
nome_tipoMenu VARCHAR(255)
);

CREATE TABLE antipasto(
id INT AUTO_INCREMENT PRIMARY KEY,
nomePiatto_antipasto VARCHAR(255),
prezzo DECIMAL(10,2),
menu_id INT,
portata_id VARCHAR(255)
);

CREATE TABLE primo (
id INT AUTO_INCREMENT PRIMARY KEY,
nomePiatto_primo VARCHAR(255),
prezzo DECIMAL(10,2),
menu_id INT,
portata_id VARCHAR(255),
tipo_pasta INT
);

CREATE TABLE secondi (
id INT AUTO_INCREMENT PRIMARY KEY,
nomePiatto_secondo VARCHAR(255),
prezzo DECIMAL(10,2),
menu_id INT,
portata_id VARCHAR(255),
tipo_cottura INT
);

CREATE TABLE contorni (
id INT AUTO_INCREMENT PRIMARY KEY,
nomePiatto_contorno VARCHAR(255),
prezzo DECIMAL(10,2),
menu_id INT,
portata_id VARCHAR(255)
);

CREATE TABLE dessert (
id INT AUTO_INCREMENT PRIMARY KEY,
nomePiatto_dessert VARCHAR(255),
prezzo DECIMAL(10,2),
menu_id INT,
portata_id VARCHAR(255),
calorie INT
);

CREATE TABLE bibite (
id INT AUTO_INCREMENT PRIMARY KEY,
nomePiatto_bibita VARCHAR(255),
prezzo DECIMAL(10,2),
menu_id INT,
portata_id VARCHAR(255),
is_alcholic BOOLEAN
);

CREATE TABLE pizze(
id INT AUTO_INCREMENT PRIMARY KEY,
nomePiatto_pizza VARCHAR(255),
prezzo DECIMAL(10,2),
menu_id INT,
portata_id VARCHAR(255),
tipo_impasto INT
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
Stato VARCHAR (255),
orario_apertura TIME,
orario_chiusura TIME,
max_posti INT,
posti_liberi INT
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

-- ALTER TABLE ristorante
-- ADD CONSTRAINT FK_RistorantePrenotazione
-- FOREIGN KEY(id) REFERENCES prenotazione(id_ristorante);
ALTER TABLE prenotazione
ADD CONSTRAINT FK_PrenotazioneRistorante
FOREIGN KEY(id_ristorante) REFERENCES prenotazione(id);


ALTER TABLE prenotazione
ADD CONSTRAINT FK_PrenotazioneCliente
FOREIGN KEY(id_cliente) REFERENCES cliente(id);

-- ALTER TABLE menu
-- ADD CONSTRAINT FK_MenuAntipasto
-- FOREIGN KEY(id) REFERENCES antipasto(menu_id);
ALTER TABLE antipasto
ADD CONSTRAINT FK_AntipastoMenu
FOREIGN KEY(menu_id) REFERENCES menu(id);

-- ALTER TABLE menu
-- ADD CONSTRAINT FK_MenuPrimi
-- FOREIGN KEY(id) REFERENCES primo(menu_id);
ALTER TABLE primo
ADD CONSTRAINT FK_PrimiMenu
FOREIGN KEY(menu_id) REFERENCES menu(id);

-- ALTER TABLE menu
-- ADD CONSTRAINT FK_MenuSecondi
-- FOREIGN KEY(id) REFERENCES secondi(menu_id);
ALTER TABLE secondi
ADD CONSTRAINT FK_SecondiMenu
FOREIGN KEY(menu_id) REFERENCES menu(id);

-- ALTER TABLE menu
-- ADD CONSTRAINT FK_MenuContorno
-- FOREIGN KEY(id) REFERENCES contorni(menu_id);
ALTER TABLE contorni
ADD CONSTRAINT FK_ContornoMenu
FOREIGN KEY(menu_id) REFERENCES menu(id);

-- ALTER TABLE menu
-- ADD CONSTRAINT FK_MenuDessert
-- FOREIGN KEY(id) REFERENCES dessert(menu_id);
ALTER TABLE dessert
ADD CONSTRAINT FK_DessertMenu
FOREIGN KEY(menu_id) REFERENCES menu(id);

-- ALTER TABLE menu
-- ADD CONSTRAINT FK_MenuBibite
-- FOREIGN KEY(id) REFERENCES bibite(menu_id);
ALTER TABLE bibite
ADD CONSTRAINT FK_BibiteMenu
FOREIGN KEY(menu_id) REFERENCES menu(id);

-- ALTER TABLE menu
-- ADD CONSTRAINT FK_MenuPizza
-- FOREIGN KEY(id) REFERENCES pizze(menu_id);
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
FOREIGN KEY(id_portata) REFERENCES antipasto(id);

ALTER TABLE portataallergeni
ADD CONSTRAINT FK_Primo
FOREIGN KEY(id_portata) REFERENCES primo(id);

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

ALTER TABLE menu
ADD CONSTRAINT FK_TipoMenu
FOREIGN KEY(tipo_menu) REFERENCES tipomenu(id);

INSERT INTO ristorante(nome_ristorante, indirizzo, orario_apertura, orario_chiusura, max_posti, posti_liberi)
VALUES ('Team Java19', 'Via Sparsi Per l\' Italia, 5', '17:00:00', '06:00:00', 50, 50),
('La Perla', 'Via il Molo, 7', '06:00:00', '03:00:00', 30, 30),
('Il Ghiottone', 'Via Aldo moro, 9', '09:00:00', '00:00:00', 200, 200);

INSERT INTO tipomenu(nome_tipoMenu)
VALUES ('Carne'), ('Pesce'), ('Vegano'), ('Pizza'), ('Bibite');

INSERT INTO menu(nome_menu, tipo_menu, ristorante_id)
VALUES ('Monte', 1, 1), ('Monte', 1, 3), ('Amici della natura', 3, 1), ('Amici della natura', 3, 3),
 ('Mare', 2, 1),  ('Mare', 2, 2), ('Pizza', 4, 1), ('Bibite', 5, 1), ('Bibite', 5, 2), ('Bibite', 5, 3);
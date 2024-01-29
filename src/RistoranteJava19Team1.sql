CREATE TABLE menu(
id INT AUTO_INCREMENT PRIMARY KEY,
nome_menu VARCHAR(255),
tipo_menu VARCHAR(255),
ristorante_id INT
);

CREATE TABLE tipoMenu(
id INT AUTO_INCREMENT PRIMARY KEY,
nome_tipoMenu VARCHAR(255),
menu_id INT
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
portata_id VARCHAR(255)
);
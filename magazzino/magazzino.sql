-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Creato il: Apr 09, 2020 alle 07:58
-- Versione del server: 5.7.26
-- Versione PHP: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `magazzino`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `prodotti`
--

DROP TABLE IF EXISTS `prodotti`;
CREATE TABLE IF NOT EXISTS `prodotti` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descrizione` varchar(100) NOT NULL,
  `prezzo` float NOT NULL DEFAULT '0',
  `quantita` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `prodotti`
--

INSERT INTO `prodotti` (`id`, `descrizione`, `prezzo`, `quantita`) VALUES
(1, 'monitor', 300, 130),
(2, 'mouse', 50, 150),
(4, 'tv', 1000, 10),
(5, 'usb', 100, 50),
(8, 'tablet', 1000, 20);

-- --------------------------------------------------------

--
-- Struttura della tabella `transazione`
--

DROP TABLE IF EXISTS `transazione`;
CREATE TABLE IF NOT EXISTS `transazione` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` enum('+','-') NOT NULL,
  `id_prodotto` int(11) NOT NULL,
  `quantita` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `transazione`
--

INSERT INTO `transazione` (`id`, `tipo`, `id_prodotto`, `quantita`) VALUES
(1, '+', 1, 10),
(2, '-', 2, 10),
(3, '+', 1, 10),
(4, '+', 1, 10),
(5, '+', 1, 100),
(6, '-', 1, 100),
(8, '+', 1, 10),
(9, '-', 1, 10);

--
-- Trigger `transazione`
--
DROP TRIGGER IF EXISTS `begore_insert_magazzino`;
DELIMITER $$
CREATE TRIGGER `begore_insert_magazzino` BEFORE INSERT ON `transazione` FOR EACH ROW BEGIN
	DECLARE quantita_prodotto int(11);
	DECLARE msg varchar(255);
	SET quantita_prodotto = (select quantita FROM prodotti p WHERE p.id = NEW.id_prodotto);
    
	if NEW.tipo = "+" && quantita_prodotto >= 0
        THEN
        UPDATE prodotti
        SET quantita = quantita + NEW.quantita
        WHERE id = new.id_prodotto;        
    ELSEIF new.quantita <= quantita_prodotto && NEW.tipo = "-"
    	THEN
        UPDATE prodotti
        SET quantita = quantita - NEW.quantita
        WHERE id = new.id_prodotto;
     ELSE
         SET msg = CONCAT("Non ci sono abbastanza articoli in magazzino");
         SIGNAL SQLSTATE VALUE '45000'
         SET MESSAGE_TEXT = msg;
    END IF;
END
$$
DELIMITER ;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

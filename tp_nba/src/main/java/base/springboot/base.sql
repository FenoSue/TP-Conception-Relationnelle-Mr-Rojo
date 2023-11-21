/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  USER
 * Created: 17 oct. 2023
 */

create database Basket;
alter database Basket owner to projet;

-- Table Personne
CREATE TABLE Personne (
    id serial primary key,
    nom VARCHAR(255),
    age integer
);
insert into personne (nom,age) values 
('Rakoto',24),
('Rabe',25),
('Randria',23),
('Andria',24);

-- Table Equipe
CREATE TABLE Equipe (
  id serial primary key,
  nom VARCHAR(255),
  nombreJoueur integer
);
insert into Equipe (nom,nombreJoueur) values 
('Equipe 1',2),
('Equipe 2',2);

-- Table joueur
CREATE TABLE joueur (
    id serial primary key,
    idPersonne integer references Personne (id),
    idEquipe integer references Equipe (id)
);
insert into Joueur (idpersonne,idequipe) values 
(1,1),
(2,2),
(3,1),
(4,2);

-- Table Match
CREATE TABLE Match (
    id  serial primary key,
    idEquipe1 integer references Equipe (id),
    idEquipe2 integer references Equipe (id),
    dateMatch date,
    duree int
);
insert into Match (idEquipe1,idEquipe2,dateMatch,duree) values 
(1,1,'2023-11-20',90);

-- Table Statistique
CREATE TABLE Statistique (
    id serial primary key,
    idMatch integer references Match (id),
    idJoueur integer references Joueur (id),
    point integer,
    minutes integer
);

-- Table classement
CREATE TABLE classement (
    id serial primary key,
    idMatch integer references Match (id),
    idEquipe integer references Equipe (id),
    idStatistique integer references Statistique (id)
);

-- Table passe
CREATE TABLE passeTir (
    id  serial primary key,
    idMatch integer references Match (id),
    idJoueur integer references Joueur (id),
    nombre integer,
    types integer
);

-- Table Rebond
CREATE TABLE Rebond (
    id  serial primary key,
    idMatch integer references Match (id),
    idJoueur integer references Joueur (id),
    nombre integer,
    TypeRebond VARCHAR(255)
);

create view ListeJoueur as
select equipe.id as idequipe,equipe.nom as equipe,joueur.id as idjoueur,personne.nom as joueur 
from equipe join joueur on equipe.id=joueur.idequipe join personne on joueur.idpersonne=personne.id;

create view StatistiqueJoueur as
select joueur.id as idJoueur,personne.nom as nom,rebond.nombre as nombreRebond,passe.nombre as nombrePasse,tir.nombre as nombreTir,
statistique.point as nombrePoint,statistique.minutes as dureeSurTerrain 
from  joueur join personne on joueur.idpersonne=personne.id join rebond on joueur.id=rebond.idjoueur 
join statistique on joueur.id=statistique.idjoueur join passe on joueur.id=passe.idjoueur join tir on joueur.id=tir.idjoueur;

create view passe as select * from passetir where types=11;
create view tir as select * from passetir where types=22;

create view GetStatJoueur as
select listejoueur.*,statistiquejoueur.nombrerebond as nombrerebond,statistiquejoueur.nombrepoint as nombrepoint,statistiquejoueur.nombrePasse as nombrePasse,
statistiquejoueur.nombreTir as nombreTir,statistiquejoueur.dureesurterrain as dureesurterrain 
from listejoueur full join statistiquejoueur on listejoueur.idjoueur=statistiquejoueur.idjoueur;

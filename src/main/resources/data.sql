INSERT INTO Korisnik(DTYPE, korisnicko_ime, ime, prezime,Lozinka, telefon, email, datum_rodjenja, aktivan) 
VALUES('Clan', 'raki','Radovan', 'Radovanovic','lozinka123', '065223', 'radovan.raske', '04.09.1997', TRUE);;

INSERT INTO Fitnes_Centar(Naziv, Email, Adresa, Br_tel) 
VALUES('Non-stop fitnes', 'fitnes@gmail.com', 'Neka adresa', '0621112');;

INSERT INTO Korisnik(DTYPE, korisnicko_ime, ime, prezime,Lozinka, telefon, email, datum_rodjenja, aktivan, fitnes_centar) 
VALUES('Trener','maki','Marko', 'Markovic','123456', '065223', 'maki.maki', '24.03.1997', TRUE, 'Non-stop fitnes');;

INSERT INTO Korisnik(DTYPE, korisnicko_ime, ime, prezime,Lozinka, telefon, email, datum_rodjenja, aktivan, fitnes_centar) 
VALUES('Trener','luka123','Luka', 'Lukovic', 'NekaLozink@123','065223', 'luka.lux', '30.05.1992', TRUE, 'Non-stop fitnes');;


INSERT INTO Trening(Naziv, Opis,tip_treninga, trajanje, trener)
VALUES('Trening1', 'ritmican trening', 'kardio', 35, 'maki');;

INSERT INTO Trening(Naziv, Opis,tip_treninga, trajanje, trener)
VALUES('Trening2', 'rade se grudi i ramena', 'trening sa tegovima', 35, 'luka123');;

INSERT INTO Trening(Naziv, Opis,tip_treninga, trajanje, trener)
VALUES('Trening3', 'noge', 'trening sa tegovima', 40, 'luka123');;

INSERT INTO LISTA_ODRADJENIH_TRENINGA(CLAN, ODRADJENI_TRENING)
VALUES('raki', 'Trening3');;

INSERT INTO LISTA_ODRADJENIH_TRENINGA(CLAN, ODRADJENI_TRENING)
VALUES('raki', 'Trening2');;

INSERT INTO LISTA_PRETPLACENIH_TRENINGA(CLAN, PRETPLACENI_TRENING)
VALUES('raki', 'Trening1');;

INSERT INTO SALA(OZNAKA_SALE, KAPACITET, FITNES_CENTAR)
VALUES ('A1', 30, 'Non-stop fitnes');;

INSERT INTO SALA(OZNAKA_SALE, KAPACITET, FITNES_CENTAR)
VALUES ('B3', 40, 'Non-stop fitnes');

INSERT INTO RASPORED_TRENINGA(CENA, DAN, SALA, TRENING)
VALUES (240, 'Sreda', 'A1', 'Trening2');;

INSERT INTO RASPORED_TRENINGA(CENA, DAN, SALA, TRENING)
VALUES (300, 'Petak', 'B3', 'Trening1');;

INSERT INTO RASPORED_TRENINGA(CENA, DAN, SALA, TRENING)
VALUES (350, 'Subota', 'B3', 'Trening3');;

INSERT INTO OCENA (OCENA, CLAN, TRENING)
VALUES (10, 'raki', 'Trening3');;

INSERT INTO OCENA (OCENA, CLAN, TRENING)
VALUES (8, 'raki', 'Trening2')

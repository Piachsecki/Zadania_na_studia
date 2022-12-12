# ObjectOrientedProgramming PWR
Programowanie Obiektowe
Laboratorium 6 – (27 kwietnia 2022)
mgr inż. Damian Mroziński
Poniższe zadania ułożył mgr inż. Jędrzej Kozal.
Zadanie 6.0(Pkt. 6.0):
Przygotowujesz program dla firmy informatycznej mający obliczać wypłatę pracowników z uwzględnieniem podatków i premii. Każdy pracownik otrzymuje pensję. Pensja dwóch pracowników na
tym samym stanowisku może być różna. Każdy pracownik płaci podatek w wysokości 17% (w tym
zadniu nie uwzględniamy progów podatkowych). W firmie są zatrudnione trzy rodzaje pracowników:
• Księgowy - pracownicy zatrudnieni w księgowości otrzymują premię w wysokości 10% pensji.
Premia podlega opodatkowaniu.
• Pracownik działu IT - otrzymuje premię w zależności od doświadczenia:
– pracownicy mający poniżej 2 lat doświadczenia otrzymują premię w wysokości 500zł.
– pracownicy mający więcej lub równo 2 lata doświadczenia i mniej niż 5 lat otrzymują
premię w wysokości 2000zł.
– pracownicy mający więcej lub równo 5 lat doświadczenia otrzymują premię w wysokości
5000zł.
Tak jak w przypadku księgowych premia podlega opodatkowaniu.
• Programiści - otrzymują taką samą premię jak pracownicy IT i dodatkowo korzystają z ulg
podatkowych dla osób prowadzących działalność kreatywną i płącą połowę podatku.
Stwórzy cztery klasy: jedną klasę bazową reprezentującą pracownika i trzy klasy dla każdego typu pracownika. Klasa bazowa powinna zawierać imię, nazwisko i wysokość pensji pracownika. Klasa
odpowiedzialna za pracowników IT powinna przechowywać informacje o ilości przepracowanych lat.
Stwórz następujących pracowników:
• Adam Wiśniewski, księgowy, pensja 6000zł
• Agata Wróbel, pracownik IT, pensja 7500zł, 3 lata doświadczenia
• Paweł Kowalski, pracownik IT, pensja 5000zł, 1 rok doświadczenia
• Ada Nowak, programista, pensja 8000zł, 6 lat doświadczenia
Oblicz i wypisz wysokość pensji po naliczeniu premii i opodatkowania dla każdego pracownika.
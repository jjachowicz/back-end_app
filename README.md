# back-end_app


Aplikacja napisana jest w języku Java i służy do zarządzania rezerwacjami w hotelu, gośćmi oraz pokojami. 
Możemy tworzyć nowe obiekty, edytować, usuwać, wyszukiwać pojedyncze wybrane obiekty za pomocą parametrów oraz wybierać całe listy wybranych obiektów. 
Dostępna jest również opcja paginacji, raporty: listowanie najczęstszego gościa i najczęściej rezerwowany pokój, wybieranie wszystkich rezerwacji dla dalego gościa i dla danego pokoju.

Wszystkie queries potrzebne do używania aplikacji zapisane są jako komentarze nad metodami w kodzie aplikacji. Są to zapytania GET, przekazywane bezpośrednio jako adres url strony i zapytania POST w postaci cURL.

Aplikacja składa się z dwóch mikroserwisów komunikujących się ze sobą: Hotel_app na porcie 8088 łączący się z bazą danych "hotel", która posiada 3 tabele: "guests", "rooms" i "reservations" oraz Login na porcie 8089 łączący się z bazą danych "login_db", która posiada jedną tabelę "users".

Aby zbudować wersję produkcyjną aplikacji należy przejść do katalogu głównego aplikacji, następnie w tym folderze wykonać komendę: "mvn package".
Stworzony plik .jar będzie znajdował się w folderze 'target'. Aby uruchomić aplikację w wierszu poleceń wpisujemy: "java -jar nazwa_pliku".

Linki do pojedynczych mikroserwisów:
https://github.com/jjachowicz/Hotel_app.git
https://github.com/jjachowicz/Login.git

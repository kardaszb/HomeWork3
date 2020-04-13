 - Klasa to **rodzaju szablon.**
  - Obiekt to **konkretny egzemplarz klasy**
  - Zmienna to **nazwa wartość do której możemy sie odwołać po tej wałaśnie nazwie**
  - Każda zmienna musi mieć określony **typ** np. int, albo String.
  - Jeżeli deklarację zmiennej poprzedzimy słowem final, to **znaczy tyle ze, do zmiennej mozemy przypisac wartosc tylko raz**
  - W klasie mogą się znajdować **metody**, **zmienne** i **instancje** są one wywoływane przez operator **new** i służą do tworzenia nowych obiektów.
  - Jeśli w klasie zdefiniowano chociaż jeden **konstruktor** to kompilator nie wygeneruje dla nas **konstruktora** domyślnego.
  - Zakładając, że istnieje klasa Car, to przy zapisie:
```java
Car car1 = new Car(„BMW”, „M5”, 2007, 2.6);  
Car car2 = car1;
```
car1 i car2 to dwie **zmienne** wskazujące na ten sam **obiekt**.

![Image description](C:\Users\barte\javaStart\WorkHome\3\Annotation 2020-04-13 214446.png)
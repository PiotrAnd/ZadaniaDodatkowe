package dodatkoweZadania;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.*;

public class Kadry {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> person = new ArrayList<>();

        System.out.println("[1] - Dodanie pracownika\n[2] - Edycję pracowników\n" +
                "[3] - Kasowanie pracowinków\n[4] - Wyświetlenie listy wszystkich pracowników\n" +
                "[5] - Wyszukiwanie pracownika po nazwisku\n[6] - Zapis do pliku listy wszystkich pracowników\n" +
                "[7] - Sortowanie listy\n" +
                "[8] - Wyjście z programu");

        person.add(new Person("Kowalski", "Jan", "8712141234", "2011-07-17", 3200));
        person.add(new Person("Nowak", "Zbigniew", "8909141234", "2012.09.14", 3400));
        person.add(new Person("Zonk", "Tadeusz", "8812141234", "2011.01.02", 2800));
        person.add(new Person("Andzik", "Mateusz", "8312141234", "2014.07.17", 2200));

        int choice=0;

        while (choice!=8) {
            System.out.println("Wybierz opcję:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Podaj nazwisko");
                    String surname = scanner.next();
                    System.out.println("Podaj imię");
                    String name = scanner.next();
                    System.out.println("Podaj Pesel");
                    String pesel = scanner.next();
                    System.out.println("Podaj początek pracy");
                    String job = scanner.next();
                    System.out.println("Podaj pensję");
                    double pensja = scanner.nextDouble();
                    person.add(new Person(surname, name, pesel, job, pensja));
                    break;
                case 2:
                    System.out.println("Podaj ktora pozycję edytować");
                    for (int i =0;i<person.size();i++) {
                        System.out.println("[" + i + "] " + person.get(i));
                    }
                    int pozycjaZListy = scanner.nextInt();
                    System.out.println("[1] - Nazwisko \n[2] - Imię\n[3] - PESEL\n" +
                            "[4] - Data rozpoczęcia pracy\n[5] Pensja ");

                    int pozycja = scanner.nextInt();

                    if (pozycja==1)
                        System.out.println("Zmień nazwisko");
                        String nazwisko1 = scanner.next();
                    if (pozycja==2)
                        System.out.println("Zmień imię");
                    String imię = scanner.next();

                    person.set(pozycjaZListy,new Person(nazwisko1,imię,"8712141233","2011.07.17",2200));
                    break;
                case 3:
                    System.out.println("Ktorą pozycję usunąć");
                    for (int i =0;i<person.size();i++) {
                        System.out.println("[" + i + "] " + person.get(i));
                    }
                    int remove = scanner.nextInt();
                    person.remove(remove);
                    break;
                case 4:
                    for (Person e : person)
                        System.out.println(e.toString());
                    break;
                case 5:
                    System.out.println("Podaj nazwisko ");
                    String nazwisko = scanner.next();
                    for (Person p : person) {
                        if (nazwisko.equals(p.getSurname())) {
                            System.out.println(p);
                        }
                    }
                    break;
                case 6:
                    FileWriter writer = new FileWriter("a.txt");
                    for (int i=0;i<person.size();i++) {
                        String str = person.get(i).toString();
                        writer.write(str);
                        if(i <= person.size())
                            writer.write("\n");
                    }
                    writer.close();
                    break;
                case 7:
                    person.sort(Comparator.comparing(Person::getSurname));
                    break;
                case 8:
                    break;
                case 9:
                    System.out.println("KONIEC PROGRAMU");
                    break;
            }
            }
    }

}


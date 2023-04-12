package stepsDefinition;

public class Test {

    public static void main(String[] arg) {

// Verificare sa contina textele : "defectele" "sa" "asigure"
        String text = "De ce este testarea necesara? sa previna defectele sa reduca cantitatea de defecte din productie sa asigure ca defectele din productie nu afecteaza financiar compania (profitabilitatea) sa creasca calitatea produsului software sa se asigure ca cerintele sunt implementate complet si corect sa valideze ca produsul se comporta in concordanta cu scopul acestuia sa mentina reputatia companiei";
        boolean contineDefecte = text.contains("defectele");
        boolean contineSa = text.contains("sa");
        boolean contineAsigure = text.contains("asigure");
        System.out.println("Textul contine cuvantul 'defectele': " + contineDefecte);
        System.out.println("Textul contine cuvantul 'sa': " + contineSa);
        System.out.println("Textul contine cuvantul 'asigure': " + contineAsigure);

// Verficare numar caractere

        String fraza = "sa previna defectele";
        int numarCaractere1 = fraza.length();
        System.out.println("Numarul de caractere din fraza este: " + numarCaractere1);

        String fraza2 = "sa asigure că defectele din productie nu afecteaza financiar compania (profitabilitatea)";
        int numarCaractere2 = fraza2.length();
        System.out.println("Numarul de caractere din fraza este: " + numarCaractere2);

        String fraza3 = "sa se asigure ca cerintele sunt implementate complet si corect";
        int numarCaractere3 = fraza3.length();
        System.out.println("Numarul de caractere din fraza este: " + numarCaractere3);

        String fraza4 = "sa mențină reputatia companiei";
        int numarCaractere4 = fraza4.length();
        System.out.println("Numarul de caractere din fraza este: " + numarCaractere4);

// Calcul procentaj caractere

        String text6 = "De ce este testarea necesara?\n"
                + "sa previna defectele\n"
                + "sa reducă cantitatea de defecte din productie\n"
                + "sa asigure ca defectele din productie nu afecteaza financiar compania (profitabilitatea)\n"
                + "sa creasca calitatea produsului software\n"
                + "sa se asigure ca cerintele sunt implementate complet si corect\n"
                + "sa valideze că produsul se comporta în concordanța cu scopul acestuia\n"
                + "sa mentină reputatia companiei";

// Calculam numarul total de caractere din text
        int numarTotalCaractere = text.length();

// Calculam numarul de caractere din fiecare fraza
        String fraza5 = "sa reducă cantitatea de defecte din productie";
        int numarCaractereFraza1 = fraza5.length();

        String fraza6 = "sa creasca calitatea produsului software";
        int numarCaractereFraza2 = fraza6.length();

// Calculam procentul de caractere reprezentat de fiecare fraza
        double procentFraza1 = (double) numarCaractereFraza1 / numarTotalCaractere * 100;
        double procentFraza2 = (double) numarCaractereFraza2 / numarTotalCaractere * 100;

// Afisam procentele
        System.out.println("Fraza 1 reprezinta " + procentFraza1 + "% din text.");
        System.out.println("Fraza 2 reprezinta " + procentFraza2 + "% din text.");

    }

}
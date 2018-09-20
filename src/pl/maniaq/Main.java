package pl.maniaq;


public class Main {

    public static void main(String[] args) {
	    System.out.println(Colors.BLUE.getHexColor());
        System.out.println(Colors.RED.getHexColor());
        System.out.println(Colors.YELLOW.getHexColor());

        Colors color = Colors.YELLOW;

        switch (color) {
            case YELLOW:
                System.out.println("Dales mi kolor żółty");
                break;
            case GREEN:
                System.out.println("Dales mi kolor zielony");
                break;
            case BLUE:
                System.out.println("Dales mi kolor niebieski");
                break;
            case RED:
                System.out.println("Dales mi kolor czerwony");
                break;
        }

        for (Colors colors : Colors.values()) {
            System.out.println("Biorę color hex: " + colors.getHexColor());
            System.out.println("Biorę color: " + colors.name());
            System.out.println("Jego numer: " + colors.ordinal());
        }


        // Nie możliwe - enum ma tylko konstruktor PRYWATNY
        //Colors color2 = new Colors(125, 55, 2);
    }
}

import javax.swing.*;

public class Inicio {
    public static void main(String[] args) {

        int opcion_menu = -1;
        String[] botones = {
                "1. ver gatos",
                "2. salir"
        };

        do {

            String opcion = (String) JOptionPane.showInputDialog(null, "Gatitos Java", "Menu principal", JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);

            switch (opcion) {
                case"1. ver gatos" :
                    GatoService.verGato();
                    continue;
                case"2. salir":
                    opcion_menu = 1;
                    break;
                default:
                    thrownewAssertionError();
            }

        } while (opcion_menu!=1);
}

    private static void thrownewAssertionError() {
    }
}


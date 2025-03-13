package Lehtomaki;

public interface CanBeColored {

    public default String setColor(String color) {

        if (color != null) {

            switch (color.toLowerCase()) {
                case "blue":
                    return "Blue";
                case "green":
                    return "Green";
                case "red":
                    return "Red";
                case "yellow":
                    return "Yellow";
                default:
                    return "No color";
            }
        }
        return "No color";
    }

    public String getColor();

}

package Enums;

public enum PetStatus {
    available,
    pending,
    sold;

    public static PetStatus safeValueOf(String value) {
        try {
            return PetStatus.valueOf(value.toLowerCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid PetStatus value: " + value + ", defaulting to 'available'");
            return PetStatus.available;
        }
    }
}

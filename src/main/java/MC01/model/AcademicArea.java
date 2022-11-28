package MC01.model;


public enum AcademicArea {
    // default
    PENDING_TO_CATALOG,
    // academic areas
    PHYSICS,
    MATH,
    CHEMISTRY,
    COMPUTER_SCIENCE,
    ENGINEERING,
    OTHER;


    /**
     * Returns the enum value from a string.
     * @param text
     * @return
     */
    public static AcademicArea fromString(String text) {
        if (text != null)
            for (AcademicArea value : AcademicArea.values())
                if (text.equalsIgnoreCase(value.name()))
                    return value;
        return null;
    }

}

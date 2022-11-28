package MC01.model;

public enum UserStatus {
    // ? For new users
    NULL,

    // ? Academic
    TEACHER,

    STUDENT,
    TEMPORARY_LEAVE,
    GRADUATED,

    // ? Epmloyees
    EMPLOYEE,
    FORMER_EMPLOYEE, // EX-EMPLOYEE
    
    // ? Admins
    DIRECTOR,
    ADMINISTRATOR,
    SECRETARY,

    // ? Others
    LIBRARIAN,
    TECHNICIAN,
    SECURITY,
    CLEANER,
    DRIVER,
    OTHER

}

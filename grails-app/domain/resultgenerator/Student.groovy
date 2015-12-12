package resultgenerator

class Student {

    Integer rollNo
    String name
    String email
    Batch batch

    static mapping = {

        id generator: 'assigned', name: 'rollNo'
        version false
    }
    static constraints = {
        name nullable: false, blank: false, maxSize: 50
        email nullable: false, blank: false, maxSize: 60
        batch nullable: false
    }
}

package resultgenerator

class Faculty {

    String name
    static hasMany = [teach:Teach]

    static constraints = {
        name nullable: false,blank: false
    }
}

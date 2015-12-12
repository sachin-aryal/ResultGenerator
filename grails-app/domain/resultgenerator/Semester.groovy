package resultgenerator

class Semester {
    int sem
    static constraints = {
        sem min: 1,max: 8,nullable:false
    }
}

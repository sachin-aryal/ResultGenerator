package resultgenerator

class Batch {

    int batch
    Semester currentSemester

    static constraints = {
        batch min: 2015,null:false
        currentSemester nullable: false
    }
}

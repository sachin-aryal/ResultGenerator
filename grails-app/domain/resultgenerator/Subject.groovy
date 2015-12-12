package resultgenerator

class Subject {

    String subjectName
    String subjectCode
    Batch batch
    Semester semester

    static constraints = {
        subjectName nullable: false,blank: false
        subjectCode nullable: false,blank: false,unique: true
        batch nullable: false
        semester nullable: false
    }
}

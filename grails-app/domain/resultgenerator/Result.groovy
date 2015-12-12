package resultgenerator

class Result {

    Double marksObtained
    String status
    Semester semester
    static belongsTo = [student:Student,subjectExamination:SubjectExamination]
    static constraints = {
        marksObtained nullable: false
        status blank: false,nullable: false
        semester nullable: false
        student nullable: false
        subjectExamination nullable: false
    }
}

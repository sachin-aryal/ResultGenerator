package resultgenerator

class SubjectExamination {

    String examination
    Double fullMark
    Double passMark
    static belongsTo = [subject:Subject]
    static constraints = {
        examination nullable: false,blank: false
        fullMark nullable: false
        passMark nullable: false
        subject nullable: false
    }
}

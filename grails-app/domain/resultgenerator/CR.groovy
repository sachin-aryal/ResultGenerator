package resultgenerator

class CR {

    Batch batch
    Semester semester

    static belongsTo = [student:Student]

    static constraints = {
        student nullable: false
        semester nullable: false
        batch nullable: false
    }
}

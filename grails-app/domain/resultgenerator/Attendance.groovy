package resultgenerator

class Attendance {

    Semester semester
    static belongsTo = [subject:Subject,student:Student]
    static constraints = {
        semester nullable: false
        subject nullable: false
        student nullable: false
    }
}

package resultgenerator

class Teach {
    Batch batch;
    Semester semester
    static belongsTo = [faculty:Faculty,subject:Subject]
    static constraints = {
        batch nullable: false
        semester nullable: false
        faculty nullable: false
        subject nullable: false
    }
}

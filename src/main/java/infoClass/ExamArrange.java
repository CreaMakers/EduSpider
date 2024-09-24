package infoClass;

// 考试安排
public class ExamArrange {

        public int id;         // 序号
        public String place;  // 校区
        public String examId;  // 考试场次
        public String CourseId; // 课程编号
        public String name; // 课程名称
        public String teacher; // 授课老师
        public String time; //  考试时间
        public String room; // 考场

    public ExamArrange(int id, String place, String examId, String CourseId, String name, String teacher, String time, String room) {
        this.id = id;
        this.place = place;
        this.examId = examId;
        this.CourseId = CourseId;
        this.teacher = teacher;
        this.time = time;
        this.room = room;
        this.name = name;
    }

    // 重写toString()方法，方便打印对象信息
    @Override
    public String toString() {
        return "ExamArrange {" +
                "序号=" + id +
                ", 校区='" + place + '\'' +
                ", 考试场次='" + examId + '\'' +
                ", 课程编号='" + CourseId + '\'' +
                ", 课程名称='" + name + '\'' +
                ", 授课老师='" + teacher + '\'' +
                ", 考试时间='" + time + '\'' +
                ", 考场='" + room + '\'' +
                '}';
    }


}

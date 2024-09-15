package infoClass;
// 课表


public class CourseInfo {
    private String courseName; //课程名称
    private String teacher; //课程老师
    private String weeks; //上课周次
    private String classroom; //课程地点

    private String weekday;

    // 构造方法
    public CourseInfo(String courseName, String teacher, String weeks, String classroom, String weekday) {
        this.courseName = courseName;
        this.teacher = teacher != null ? teacher : "未知"; // 如果老师为空，默认为 "未知"
        this.weeks = weeks;
        this.classroom = classroom != null ? classroom : "未指定"; // 如果教室为空，默认为 "未指定"
        this.weekday = weekday;
    }

    // 格式化输出的 toString 方法
    @Override
    public String toString() {
        return "课程名称: " + courseName + "\n" +
                "老师: " + teacher + "\n" +
                "上课周次: " + weeks + "\n" +
                "教室: " + classroom + "\n" +
                "星期: " + weekday + "\n" +
                "---------------------------";
    }
}


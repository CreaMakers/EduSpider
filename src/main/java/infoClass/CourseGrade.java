package infoClass;

// 课程考核结果
public class CourseGrade {
    public String id; // 序号
    public String item;  // 开课学期
    public String name; // 课程名称
    public String grade; // 成绩
    public String flag; // 成绩标识
    public String score; // 学分
    public String timeR; // 总学时
    public String point; // 绩点
    public String ReItem; // 补重学期
    public String method; // 考核方式
    public String property; // 考试性质
    public String attribute; // 课程属性

    // 构造函数
    public CourseGrade(String id, String item, String name, String grade,
                       String flag, String score, String timeR, String point, String ReItem,
                       String method, String property, String attribute) {
        this.id = id;
        this.item = item;
        this.name = name;
        this.grade = grade;
        this.flag = flag;
        this.score = score;
        this.timeR = timeR;
        this.point = point;
        this.ReItem = ReItem;
        this.method = method;
        this.property = property;
        this.attribute = attribute;
    }

    // 重写toString()方法
    @Override
    public String toString() {
        return "CourseGrade {" +
                "id='" + id + '\'' +
                ", item='" + item + '\'' +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", flag='" + flag + '\'' +
                ", score='" + score + '\'' +
                ", timeR='" + timeR + '\'' +
                ", point='" + point + '\'' +
                ", ReItem='" + ReItem + '\'' +
                ", method='" + method + '\'' +
                ", property='" + property + '\'' +
                ", attribute='" + attribute + '\'' +
                '}';
    }
}

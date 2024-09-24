package org.example;


import infoClass.CourseGrade;
import infoClass.CourseInfo;
import infoClass.ExamArrange;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import spiderMethond.GetCookies;
import spiderMethond.GetCourseGrade;
import spiderMethond.GetCourseInfo;
import spiderMethond.GetExamArrange;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yuxialuozi
 * @data 2024/09/09 - 20:35
 * @description 长沙理工大学教务系统的一系列信息爬取
 */
public class Main {

    public static void main(String[] args) throws IOException {
        GetCookies getCookies = new GetCookies();
        String cook = getCookies.getHeaderFromJW("202308010135", "Jianyu@123");
        System.out.println(cook);
        System.out.println("==========================");


//        GetCourseInfo getCourseInfo = new GetCourseInfo(cook);
//        List<CourseInfo> courses = getCourseInfo.getData("8", "2024-2025-1");
//        for (CourseInfo courseInfo : courses) {
//            System.out.println(courseInfo);
//        }


//        GetExamArrange getExamArrange = new GetExamArrange(cook);
//        List<ExamArrange> examArranges = getExamArrange.getData("2024-2025-1", "期中");
//        for (ExamArrange examArrange : examArranges) {
//            System.out.println(examArrange);
//        }


        GetCourseGrade getCourseGrade = new GetCourseGrade(cook);
        List<CourseGrade> courseGrades = getCourseGrade.getData("2023-2024-2");
        for (CourseGrade courseGrade : courseGrades) {
            System.out.println(courseGrade);
        }


    }
}




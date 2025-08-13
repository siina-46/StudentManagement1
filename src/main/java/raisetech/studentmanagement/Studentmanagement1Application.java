package raisetech.studentmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Studentmanagement1Application {

  private String name = "Hamada Shiina";
  private String age = "29";

	public static void main(String[] args) {
		SpringApplication.run(Studentmanagement1Application.class, args);
	}

  @GetMapping("/studentInfo")
  public  String getStudentInfo(){
    return name + " " + age + "歳";
  }

  @PostMapping("/studentInfo")
  public void  setStudentInfo(String name, String age){
    this.name = name;
    this.age = age;
  }


  @PostMapping("/studentName")
  public void updateStudentName(String name){
    this.name = name;
  }
}

//GET POST
// GETは取得する、リクエストの結果を受け取る
// POSTは情報を与える、渡す
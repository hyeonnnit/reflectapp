package ex03;

import ex02.RequestMapping;
@Controller
public class UserController {

    // /login
    @ex02.RequestMapping(uri="/login")
    public void login(){
        System.out.println("로그인");
    }
    // /join
    @ex02.RequestMapping(uri="/join")
    public void join(){
        System.out.println("회원가입 호출됨");
    }

    @ex02.RequestMapping(uri="/userinfo")
    public void userinfo(){
        System.out.println("유저정보 공개");} // 이 정보는 절대 공개가 안됨. 전화를 해야됨

    @RequestMapping(uri="/updatepassword")
    public void updatePassword(){
        System.out.println("패스워드 수정하기");
    }

}
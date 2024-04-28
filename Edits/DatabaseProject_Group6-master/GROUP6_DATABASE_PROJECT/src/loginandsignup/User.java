/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginandsignup;

/**
 *
 * @author byaku
 */
class User {
    private int gradeid, math, science, english, hekasi, he, pe; 
    private String studentid, name;
    
    public User (int gradeid, String studentid, String name, int math, int science, int english, int hekasi, int he, int pe){
        this.gradeid = gradeid;
        this.studentid = studentid;
        this.name = name;
        this.math = math;
        this.science = science;
        this.english = english;
        this.hekasi = hekasi;
        this.he = he;
        this.pe = pe;
        
    } 
        public int getgradeid() {
        return gradeid;
        }
        public String getstudentid() {
        return studentid;
        }
        public String getname() {
        return name;
        }
        public int getmath() {
        return math;
        }
        public int getscience() {
        return science;
        }
        public int getenglish() {
        return english;
        }
        public int gethekasi() {
        return hekasi;
        }
        public int gethe() {
        return he;
        }
        public int getpe() {
        return pe;
        }
}

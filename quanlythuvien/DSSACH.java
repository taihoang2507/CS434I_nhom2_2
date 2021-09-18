/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythuvien;

import java.util.ArrayList;

/**
 *
 * @author taitongg
 */
public class DSSACH {
    ArrayList<SACH>list;

    public DSSACH() {
        list=new ArrayList<SACH>();
    }

    public ArrayList<SACH> getList() {
        return list;
    }

    public void setList(ArrayList<SACH> list) {
        this.list = list;
    }
public void Them(SACH sc){
    list.add(sc);
}
public void Capnhap(SACH sc){
        for(int i=0;i<list.size();i++){
            if(sc.getMaSach().trim().equalsIgnoreCase(list.get(i).getMaSach()))
                list.set(i,sc);
        }
    }
    public SACH Tim (String maSach){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getMaSach().trim().equalsIgnoreCase(maSach)){
                return list.get(i);
            }
        }
        return null;
        
    }
    public void Xoa(String maSach){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getMaSach().trim().equalsIgnoreCase(maSach)){
                list.remove(i);
                break;
            }
        }
    }
    public double TinhTongTienSGK(){
        int tienSGK=0;
        for(SACH sach:list){
            if(sach instanceof SACHGIAOKHOA){
                SACHGIAOKHOA gk=(SACHGIAOKHOA)sach;
                tienSGK+=gk.TinhThanhTien();
            }
        }
      return tienSGK;
    }
     public double TinhTongTienSTK(){
        int tienSTK=0;
        for(SACH sach:list){
            if(sach instanceof SACHTHAMKHAO){
                SACHTHAMKHAO tk=(SACHTHAMKHAO)sach;
                tienSTK+=tk.TinhThanhTien();
            }
        }
      return tienSTK;
    } 
   
}
    
    


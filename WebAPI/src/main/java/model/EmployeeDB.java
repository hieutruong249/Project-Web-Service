package model;

import java.sql.ResultSet;
import java.util.ArrayList;

public class EmployeeDB {
    public ArrayList findEmployeeByName(String name) {
        //String sql = String.format("SELECT * FROM nhanvien WHERE tennv like '%s'", name);
        String sql = ("SELECT * FROM nhanvien WHERE CONCAT(honv,' ',tenlot,' ',tennv) like N'%"+name+"%'");
        ArrayList<Employee> list = new ArrayList();
        Provider provider = new Provider();
        try{

            ResultSet rs = provider.excuteQuery(sql);

            while(rs.next()){
                Employee nv = new Employee();
                nv.setHonv(rs.getString("honv"));
                nv.setTenlot(rs.getString("tenlot"));
                nv.setTennv(rs.getString("tennv"));
                nv.setManv(rs.getString("manv"));
                nv.setNgsinh(rs.getString("ngsinh"));
                nv.setDchi(rs.getString("diachi"));
                nv.setPhai(rs.getString("phai"));
                nv.setLuong(rs.getDouble("luong"));
                nv.setMa_nql(rs.getString("ma_nql"));
                nv.setPhg(rs.getString("phg"));

                list.add(nv);

            }
            if(list.size()>0)
                System.out.println("Lay danh sach NV trung khop thanh cong");
            else
                System.out.println("Khong tim thay thong tin phu hop");
        }
        catch(Exception e ){
            System.out.println("Lay danh sach NV trung khop thai bai");
            System.out.println(e.getMessage());
        }
        finally{
            provider.closeConnection();
        }

        return list;
    }

    public ArrayList layDsNvien() {
        String sql = "SELECT * FROM nhanvien";
        ArrayList<Employee> list = new ArrayList();
        Provider provider = new Provider();
        try{

            ResultSet rs = provider.excuteQuery(sql);

            while(rs.next()){
                Employee nv = new Employee();
                nv.setHonv(rs.getString("honv"));
                nv.setTenlot(rs.getString("tenlot"));
                nv.setTennv(rs.getString("tennv"));
                nv.setManv(rs.getString("manv"));
                nv.setNgsinh(rs.getString("ngsinh"));
                nv.setDchi(rs.getString("diachi"));
                nv.setPhai(rs.getString("phai"));
                nv.setLuong(rs.getDouble("luong"));
                nv.setMa_nql(rs.getString("ma_nql"));
                nv.setPhg(rs.getString("phg"));

                list.add(nv);

            }
            System.out.println("Lay danh sach NV thanh cong");
        }
        catch(Exception e ){
            System.out.println(e.getMessage());
        }
        finally{
            provider.closeConnection();
        }

        return list;
    }
}

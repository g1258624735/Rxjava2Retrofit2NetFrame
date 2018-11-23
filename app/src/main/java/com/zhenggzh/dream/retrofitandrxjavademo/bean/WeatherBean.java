package com.zhenggzh.dream.retrofitandrxjavademo.bean;

import java.util.List;

/**
 * Created by gxj on 2018/11/14.
 * <p> 天气预报
 */
/*
{
 * "HeWeather6":
 * [
 * {
 * "basic":
 * {
 * "cid":"CN101281601",
 * "location":"东莞",
 * "parent_city":"东莞",
 * "admin_area":"广东",
 * "cnty":"中国",
 * "lat":"23.04623795",
 * "lon":"113.7462616",
 * "tz":"+8.00"
 * },
 * "update":
 * {
 * "loc":"2018-11-14 15:46",
 * "utc":"2018-11-14 07:46"
 * },
 * "status":"ok",
 * "now":
 * {
 * "cloud":"0",
 * "cond_code":"101",
 * "cond_txt":"多云",
 * "fl":"27",
 * "hum":"63",
 * "pcpn":"0.0",
 * "pres":"1013",
 * "tmp":"26",
 * "vis":"23",
 * "wind_deg":"239",
 * "wind_dir":"西南风",
 * "wind_sc":"2",
 * "wind_spd":"11"
 * }
 * }
 * ]
 * }
 */
public class WeatherBean {
    private List<WeatherListBean> HeWeather6;

    public List<WeatherListBean> getHeWeather6() {
        return HeWeather6;
    }

    public void setHeWeather6(List<WeatherListBean> heWeather6) {
        HeWeather6 = heWeather6;
    }

    private static class WeatherListBean {
        private BasicBean basic;
        private String status;
        private String update;
        private String now;

        public BasicBean getBasic() {
            return basic;
        }

        public void setBasic(BasicBean basic) {
            this.basic = basic;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getUpdate() {
            return update;
        }

        public void setUpdate(String update) {
            this.update = update;
        }

        public String getNow() {
            return now;
        }

        public void setNow(String now) {
            this.now = now;
        }

        @Override
        public String toString() {
            return "WeatherListBean{" +
                    "basic=" + basic +
                    ", status='" + status + '\'' +
                    ", update='" + update + '\'' +
                    ", now='" + now + '\'' +
                    '}';
        }
    }

    private static class BasicBean {
        private String cid;
        private String location;
        private String parent_city;
        private String admin_area;
        private String cnty;
        private String lat;
        private String lon;
        private String tz;

        @Override
        public String toString() {
            return "BasicBean{" +
                    "cid='" + cid + '\'' +
                    ", location='" + location + '\'' +
                    ", parent_city='" + parent_city + '\'' +
                    ", admin_area='" + admin_area + '\'' +
                    ", cnty='" + cnty + '\'' +
                    ", lat='" + lat + '\'' +
                    ", lon='" + lon + '\'' +
                    ", tz='" + tz + '\'' +
                    '}';
        }

        public String getCid() {
            return cid;
        }

        public void setCid(String cid) {
            this.cid = cid;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getParent_city() {
            return parent_city;
        }

        public void setParent_city(String parent_city) {
            this.parent_city = parent_city;
        }

        public String getAdmin_area() {
            return admin_area;
        }

        public void setAdmin_area(String admin_area) {
            this.admin_area = admin_area;
        }

        public String getCnty() {
            return cnty;
        }

        public void setCnty(String cnty) {
            this.cnty = cnty;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLon() {
            return lon;
        }

        public void setLon(String lon) {
            this.lon = lon;
        }

        public String getTz() {
            return tz;
        }

        public void setTz(String tz) {
            this.tz = tz;
        }
    }

    private static class UpdateBean {
        @Override
        public String toString() {
            return "UpdateBean{" +
                    "cloud='" + cloud + '\'' +
                    ", cond_code='" + cond_code + '\'' +
                    ", cond_txt='" + cond_txt + '\'' +
                    ", fl='" + fl + '\'' +
                    ", hum='" + hum + '\'' +
                    ", pcpn='" + pcpn + '\'' +
                    ", pres='" + pres + '\'' +
                    ", tmp='" + tmp + '\'' +
                    ", vis='" + vis + '\'' +
                    ", wind_deg='" + wind_deg + '\'' +
                    ", wind_dir='" + wind_dir + '\'' +
                    ", wind_sc='" + wind_sc + '\'' +
                    ", wind_spd='" + wind_spd + '\'' +
                    '}';
        }

        private String cloud;
        private String cond_code;
        private String cond_txt;
        private String fl;
        private String hum;
        private String pcpn;
        private String pres;
        private String tmp;
        private String vis;
        private String wind_deg;
        private String wind_dir;
        private String wind_sc;
        private String wind_spd;

        public String getCloud() {
            return cloud;
        }

        public void setCloud(String cloud) {
            this.cloud = cloud;
        }

        public String getCond_code() {
            return cond_code;
        }

        public void setCond_code(String cond_code) {
            this.cond_code = cond_code;
        }

        public String getCond_txt() {
            return cond_txt;
        }

        public void setCond_txt(String cond_txt) {
            this.cond_txt = cond_txt;
        }

        public String getFl() {
            return fl;
        }

        public void setFl(String fl) {
            this.fl = fl;
        }

        public String getHum() {
            return hum;
        }

        public void setHum(String hum) {
            this.hum = hum;
        }

        public String getPcpn() {
            return pcpn;
        }

        public void setPcpn(String pcpn) {
            this.pcpn = pcpn;
        }

        public String getPres() {
            return pres;
        }

        public void setPres(String pres) {
            this.pres = pres;
        }

        public String getTmp() {
            return tmp;
        }

        public void setTmp(String tmp) {
            this.tmp = tmp;
        }

        public String getVis() {
            return vis;
        }

        public void setVis(String vis) {
            this.vis = vis;
        }

        public String getWind_deg() {
            return wind_deg;
        }

        public void setWind_deg(String wind_deg) {
            this.wind_deg = wind_deg;
        }

        public String getWind_dir() {
            return wind_dir;
        }

        public void setWind_dir(String wind_dir) {
            this.wind_dir = wind_dir;
        }

        public String getWind_sc() {
            return wind_sc;
        }

        public void setWind_sc(String wind_sc) {
            this.wind_sc = wind_sc;
        }

        public String getWind_spd() {
            return wind_spd;
        }

        public void setWind_spd(String wind_spd) {
            this.wind_spd = wind_spd;
        }
    }

    @Override
    public String toString() {
        return "WeatherBean{" +
                "HeWeather6=" + HeWeather6 +
                '}';
    }
}

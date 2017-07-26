package com.ding.god.icloudmusic.bean;

import com.ding.god.icloudmusic.network.BaseResponse;

import java.util.List;

/**
 * Created by Administrator on 2017/7/18.
 */

public class DiscoverRecommendBean extends BaseResponse {


    private ResultBeanXXXXXXXXXXXXXXXXXX result;
    private List<ModuleBean> module;

    public ResultBeanXXXXXXXXXXXXXXXXXX getResult() {
        return result;
    }

    public void setResult(ResultBeanXXXXXXXXXXXXXXXXXX result) {
        this.result = result;
    }

    public List<ModuleBean> getModule() {
        return module;
    }

    public void setModule(List<ModuleBean> module) {
        this.module = module;
    }

    public static class ResultBeanXXXXXXXXXXXXXXXXXX {

        private Mix1Bean mix_1;
        private Mod29Bean mod_29;
        private Mix29Bean mix_29;
        private SceneBean scene;
        private RecsongBean recsong;
        private Mix9Bean mix_9;
        private Mix83Bean mix_83;
        private Mix22Bean mix_22;
        private Mix71Bean mix_71;
        private KingBean king;
        private Mix61Bean mix_61;
        private NewSongBean new_song;
        private RadioBean radio;
        private ShowListBean show_list;
        private Mod50Bean mod_50;
        private FocusBean focus;
        private DiyBean diy;
        private Mix72Bean mix_72;

        public Mix1Bean getMix_1() {
            return mix_1;
        }

        public void setMix_1(Mix1Bean mix_1) {
            this.mix_1 = mix_1;
        }

        public Mod29Bean getMod_29() {
            return mod_29;
        }

        public void setMod_29(Mod29Bean mod_29) {
            this.mod_29 = mod_29;
        }

        public Mix29Bean getMix_29() {
            return mix_29;
        }

        public void setMix_29(Mix29Bean mix_29) {
            this.mix_29 = mix_29;
        }

        public SceneBean getScene() {
            return scene;
        }

        public void setScene(SceneBean scene) {
            this.scene = scene;
        }

        public RecsongBean getRecsong() {
            return recsong;
        }

        public void setRecsong(RecsongBean recsong) {
            this.recsong = recsong;
        }

        public Mix9Bean getMix_9() {
            return mix_9;
        }

        public void setMix_9(Mix9Bean mix_9) {
            this.mix_9 = mix_9;
        }

        public Mix83Bean getMix_83() {
            return mix_83;
        }

        public void setMix_83(Mix83Bean mix_83) {
            this.mix_83 = mix_83;
        }

        public Mix22Bean getMix_22() {
            return mix_22;
        }

        public void setMix_22(Mix22Bean mix_22) {
            this.mix_22 = mix_22;
        }

        public Mix71Bean getMix_71() {
            return mix_71;
        }

        public void setMix_71(Mix71Bean mix_71) {
            this.mix_71 = mix_71;
        }

        public KingBean getKing() {
            return king;
        }

        public void setKing(KingBean king) {
            this.king = king;
        }

        public Mix61Bean getMix_61() {
            return mix_61;
        }

        public void setMix_61(Mix61Bean mix_61) {
            this.mix_61 = mix_61;
        }

        public NewSongBean getNew_song() {
            return new_song;
        }

        public void setNew_song(NewSongBean new_song) {
            this.new_song = new_song;
        }

        public RadioBean getRadio() {
            return radio;
        }

        public void setRadio(RadioBean radio) {
            this.radio = radio;
        }

        public ShowListBean getShow_list() {
            return show_list;
        }

        public void setShow_list(ShowListBean show_list) {
            this.show_list = show_list;
        }

        public Mod50Bean getMod_50() {
            return mod_50;
        }

        public void setMod_50(Mod50Bean mod_50) {
            this.mod_50 = mod_50;
        }

        public FocusBean getFocus() {
            return focus;
        }

        public void setFocus(FocusBean focus) {
            this.focus = focus;
        }

        public DiyBean getDiy() {
            return diy;
        }

        public void setDiy(DiyBean diy) {
            this.diy = diy;
        }

        public Mix72Bean getMix_72() {
            return mix_72;
        }

        public void setMix_72(Mix72Bean mix_72) {
            this.mix_72 = mix_72;
        }

        public static class Mix1Bean {
            /**
             * error_code : 22000
             * result : [{"desc":"7月新歌速递","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1499793382cebe2d826707e4b6e11b86f8cd8af34b.jpg","type_id":"367208682","type":0,"title":"新歌抢鲜听","tip_type":0,"author":"7月新歌速递"},{"desc":"胡宇威","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500953390c68deba03f614a48770ac7e7928364d7.jpg","type_id":"544527746","type":2,"title":"DO NOT DISTURB请不要打扰","tip_type":3,"author":"胡宇威"},{"desc":"那英","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_15009487528baa081146a758d2cc2d16e7bd6c6808.jpg","type_id":"548214525","type":2,"title":"三生三世十里桃花","tip_type":0,"author":"那英"},{"desc":"郭峰","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500948650a5df261e431476623c4170f4eee8a447.jpg","type_id":"548214291","type":2,"title":"再也看不见","tip_type":0,"author":"郭峰"},{"desc":"董力","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500948573fe7382165d83a2e8cd1225346aba0162.jpg","type_id":"547253486","type":2,"title":"董大力","tip_type":0,"author":"董力"},{"desc":"孔令奇/满舒克","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500864786c7b445afcf7170326cec1ebb6fda7654.jpg","type_id":"548004160","type":2,"title":"Real Life","tip_type":0,"author":"孔令奇/满舒克"}]
             */

            private int error_code;
            private List<ResultBean> result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ResultBean> getResult() {
                return result;
            }

            public void setResult(List<ResultBean> result) {
                this.result = result;
            }

            public static class ResultBean {
                /**
                 * desc : 7月新歌速递
                 * pic : http://business.cdn.qianqian.com/qianqian/pic/bos_client_1499793382cebe2d826707e4b6e11b86f8cd8af34b.jpg
                 * type_id : 367208682
                 * type : 0
                 * title : 新歌抢鲜听
                 * tip_type : 0
                 * author : 7月新歌速递
                 */

                private String desc;
                private String pic;
                private String type_id;
                private int type;
                private String title;
                private int tip_type;
                private String author;

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getTip_type() {
                    return tip_type;
                }

                public void setTip_type(int tip_type) {
                    this.tip_type = tip_type;
                }

                public String getAuthor() {
                    return author;
                }

                public void setAuthor(String author) {
                    this.author = author;
                }
            }
        }

        public static class Mod29Bean {
            /**
             * error_code : 22000
             * result : [{"desc":"","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_149217051946506880bece60f7fc94641aa8ae8bc5.jpg","type_id":"http://music.baidu.com/cms/webview/xiha/gs/index.html","type":4,"title":"滚石唱片音乐专区","tip_type":0,"author":""}]
             */

            private int error_code;
            private List<ResultBeanX> result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ResultBeanX> getResult() {
                return result;
            }

            public void setResult(List<ResultBeanX> result) {
                this.result = result;
            }

            public static class ResultBeanX {
                /**
                 * desc :
                 * pic : http://business.cdn.qianqian.com/qianqian/pic/bos_client_149217051946506880bece60f7fc94641aa8ae8bc5.jpg
                 * type_id : http://music.baidu.com/cms/webview/xiha/gs/index.html
                 * type : 4
                 * title : 滚石唱片音乐专区
                 * tip_type : 0
                 * author :
                 */

                private String desc;
                private String pic;
                private String type_id;
                private int type;
                private String title;
                private int tip_type;
                private String author;

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getTip_type() {
                    return tip_type;
                }

                public void setTip_type(int tip_type) {
                    this.tip_type = tip_type;
                }

                public String getAuthor() {
                    return author;
                }

                public void setAuthor(String author) {
                    this.author = author;
                }
            }
        }

        public static class Mix29Bean {
            /**
             * error_code : 22000
             * result : [{"desc":"","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500960364442e21ac3185c55e12bbb9c7c5e5f589.jpg","type_id":"544260632","type":2,"title":"阿拉伯电子趴，贵族般的优雅","tip_type":0,"author":""},{"desc":"","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500885843776885cb7410f3ab7473af9fd597e96d.jpg","type_id":"314034204","type":2,"title":"北欧小电音，祛暑小清新","tip_type":0,"author":""},{"desc":"","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_150062615622b5f55a5f1ec435af364cd7c27e783d.jpg","type_id":"278527889","type":2,"title":"听戏品tea，滋味神奇","tip_type":0,"author":""}]
             */

            private int error_code;
            private List<ResultBeanXX> result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ResultBeanXX> getResult() {
                return result;
            }

            public void setResult(List<ResultBeanXX> result) {
                this.result = result;
            }

            public static class ResultBeanXX {
                /**
                 * desc :
                 * pic : http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500960364442e21ac3185c55e12bbb9c7c5e5f589.jpg
                 * type_id : 544260632
                 * type : 2
                 * title : 阿拉伯电子趴，贵族般的优雅
                 * tip_type : 0
                 * author :
                 */

                private String desc;
                private String pic;
                private String type_id;
                private int type;
                private String title;
                private int tip_type;
                private String author;

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getTip_type() {
                    return tip_type;
                }

                public void setTip_type(int tip_type) {
                    this.tip_type = tip_type;
                }

                public String getAuthor() {
                    return author;
                }

                public void setAuthor(String author) {
                    this.author = author;
                }
            }
        }

        public static class SceneBean {
            /**
             * result : {"action":[{"icon_ios":"http://b.hiphotos.baidu.com/ting/pic/item/94cad1c8a786c917cd5a64c9cf3d70cf3ac757e0.jpg","scene_name":"在路上","bgpic_android":"","icon_android":"http://c.hiphotos.baidu.com/ting/pic/item/b999a9014c086e06604a914805087bf40bd1cbd7.jpg","scene_model":"2","scene_desc":"","bgpic_ios":"","scene_id":"0"},{"icon_ios":"http://b.hiphotos.baidu.com/ting/pic/item/1f178a82b9014a9007da7e4daf773912b21bee5e.jpg","scene_name":"赖床","bgpic_android":"","icon_android":"http://a.hiphotos.baidu.com/ting/pic/item/dc54564e9258d109b39702b1d658ccbf6c814db8.jpg","scene_model":"1","scene_desc":"每周总有那么7天不想起床","bgpic_ios":"","scene_id":"21"},{"icon_ios":"http://c.hiphotos.baidu.com/ting/pic/item/b3fb43166d224f4a0e1143e30ff790529922d1b1.jpg","scene_name":"一个人","bgpic_android":"","icon_android":"http://c.hiphotos.baidu.com/ting/pic/item/f636afc379310a55e4d177f7b04543a98226103f.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"10"},{"icon_ios":"http://b.hiphotos.baidu.com/ting/pic/item/a5c27d1ed21b0ef4d176a9aedbc451da80cb3ea7.jpg","scene_name":"放松","bgpic_android":"","icon_android":"http://a.hiphotos.baidu.com/ting/pic/item/0b7b02087bf40ad1e3996ee0502c11dfa9ecceb0.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"8"},{"icon_ios":"http://c.hiphotos.baidu.com/ting/pic/item/b90e7bec54e736d15a00bff89d504fc2d562692a.jpg","scene_name":"工作","bgpic_android":"","icon_android":"http://d.hiphotos.baidu.com/ting/pic/item/77c6a7efce1b9d1617f33262f4deb48f8c5464f9.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"12"}],"emotion":[{"icon_ios":"http://d.hiphotos.baidu.com/ting/pic/item/3bf33a87e950352a854306f85543fbf2b2118b1b.jpg","scene_name":"激动","bgpic_android":"","icon_android":"http://b.hiphotos.baidu.com/ting/pic/item/5882b2b7d0a20cf4f1ac61dc71094b36acaf99f1.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"34"},{"icon_ios":"http://b.hiphotos.baidu.com/ting/pic/item/a1ec08fa513d26974c932aad53fbb2fb4216d8f9.jpg","scene_name":"开心","bgpic_android":"","icon_android":"http://c.hiphotos.baidu.com/ting/pic/item/f703738da9773912e4621a62ff198618367ae269.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"38"},{"icon_ios":"http://b.hiphotos.baidu.com/ting/pic/item/9d82d158ccbf6c810ea60f18ba3eb13532fa40a8.jpg","scene_name":"治愈","bgpic_android":"","icon_android":"http://a.hiphotos.baidu.com/ting/pic/item/472309f790529822ffa5a6c0d0ca7bcb0a46d41b.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"37"}],"operation":[{"icon_ios":"http://a.hiphotos.baidu.com/ting/pic/item/d01373f082025aaff566d3a4fcedab64034f1a0c.jpg","scene_name":"热歌","bgpic_android":"","icon_android":"http://a.hiphotos.baidu.com/ting/pic/item/838ba61ea8d3fd1f55b20f55374e251f95ca5f21.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"162"},{"icon_ios":"http://c.hiphotos.baidu.com/ting/pic/item/faedab64034f78f04fd1977e7f310a55b2191c60.jpg","scene_name":"古风","bgpic_android":"","icon_android":"http://c.hiphotos.baidu.com/ting/pic/item/2cf5e0fe9925bc313c5e079a59df8db1cb1370b4.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"157"},{"icon_ios":"http://d.hiphotos.baidu.com/ting/pic/item/c2fdfc039245d6884448bf29a2c27d1ed31b24f0.jpg","scene_name":"经典老歌","bgpic_android":"","icon_android":"http://a.hiphotos.baidu.com/ting/pic/item/d058ccbf6c81800a68b98f0cb63533fa828b4757.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"161"},{"icon_ios":"http://d.hiphotos.baidu.com/ting/pic/item/c8ea15ce36d3d539961d09c13d87e950352ab08b.jpg","scene_name":"舒缓","bgpic_android":"","icon_android":"http://a.hiphotos.baidu.com/ting/pic/item/0824ab18972bd40792add5ff7c899e510fb3094d.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"159"},{"icon_ios":"http://d.hiphotos.baidu.com/ting/pic/item/cb8065380cd79123bb1999f9ab345982b3b78045.jpg","scene_name":"小清新","bgpic_android":"","icon_android":"http://a.hiphotos.baidu.com/ting/pic/item/80cb39dbb6fd526672003a16ac18972bd407368c.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"158"},{"icon_ios":"http://b.hiphotos.baidu.com/ting/pic/item/18d8bc3eb13533faf2ba9fa3aed3fd1f41345b2a.jpg","scene_name":"网络歌曲","bgpic_android":"","icon_android":"http://b.hiphotos.baidu.com/ting/pic/item/9922720e0cf3d7ca73313874f51fbe096a63a9e8.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"156"},{"icon_ios":"http://c.hiphotos.baidu.com/ting/pic/item/bd3eb13533fa828bd727916efb1f4134970a5a32.jpg","scene_name":"新歌抢鲜听","bgpic_android":"","icon_android":"http://b.hiphotos.baidu.com/ting/pic/item/9213b07eca8065382359a31190dda144ad348204.jpg","scene_model":"1","scene_desc":"网罗全球最新歌曲","bgpic_ios":"","scene_id":"33"},{"icon_ios":"http://a.hiphotos.baidu.com/ting/pic/item/dbb44aed2e738bd461c6bebca78b87d6267ff95c.jpg","scene_name":"情人节","bgpic_android":"","icon_android":"http://c.hiphotos.baidu.com/ting/pic/item/63d0f703918fa0ecfe25630f219759ee3c6ddbd6.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"155"},{"icon_ios":"http://a.hiphotos.baidu.com/ting/pic/item/4a36acaf2edda3cc469cb5ad07e93901203f92c6.jpg","scene_name":"校园歌曲","bgpic_android":"","icon_android":"http://b.hiphotos.baidu.com/ting/pic/item/a71ea8d3fd1f4134ed57037c221f95cad1c85e4b.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"160"}],"other":[{"icon_ios":"http://c.hiphotos.baidu.com/ting/pic/item/b3b7d0a20cf431ad9bb26ac94d36acaf2fdd98d9.jpg","scene_name":"流行","bgpic_android":"","icon_android":"http://b.hiphotos.baidu.com/ting/pic/item/a50f4bfbfbedab6443ffd5c3f036afc379311e27.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"48"},{"icon_ios":"http://c.hiphotos.baidu.com/ting/pic/item/b2de9c82d158ccbfe74098ca1fd8bc3eb0354145.jpg","scene_name":"国语","bgpic_android":"","icon_android":"http://a.hiphotos.baidu.com/ting/pic/item/d439b6003af33a87423e9e19c15c10385343b566.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"42"},{"icon_ios":"http://d.hiphotos.baidu.com/ting/pic/item/377adab44aed2e7364d7a8dc8101a18b87d6fa00.jpg","scene_name":"2000年代","bgpic_android":"","icon_android":"http://b.hiphotos.baidu.com/ting/pic/item/aa64034f78f0f736ec9dd4020d55b319ebc41355.jpg","scene_model":"1","scene_desc":"","bgpic_ios":"","scene_id":"71"}]}
             * error_code : 22000
             * config : [{"color_other":"","play_color":"","scene_version":0,"desc":"","end_time":0,"start_time":0,"scene_color":"","bgpic":"","bgpic_special":"","button_color":""}]
             */

            private ResultBeanXXX result;
            private int error_code;
            private List<ConfigBean> config;

            public ResultBeanXXX getResult() {
                return result;
            }

            public void setResult(ResultBeanXXX result) {
                this.result = result;
            }

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ConfigBean> getConfig() {
                return config;
            }

            public void setConfig(List<ConfigBean> config) {
                this.config = config;
            }

            public static class ResultBeanXXX {
                private List<ActionBean> action;
                private List<EmotionBean> emotion;
                private List<OperationBean> operation;
                private List<OtherBean> other;

                public List<ActionBean> getAction() {
                    return action;
                }

                public void setAction(List<ActionBean> action) {
                    this.action = action;
                }

                public List<EmotionBean> getEmotion() {
                    return emotion;
                }

                public void setEmotion(List<EmotionBean> emotion) {
                    this.emotion = emotion;
                }

                public List<OperationBean> getOperation() {
                    return operation;
                }

                public void setOperation(List<OperationBean> operation) {
                    this.operation = operation;
                }

                public List<OtherBean> getOther() {
                    return other;
                }

                public void setOther(List<OtherBean> other) {
                    this.other = other;
                }

                public static class ActionBean {
                    /**
                     * icon_ios : http://b.hiphotos.baidu.com/ting/pic/item/94cad1c8a786c917cd5a64c9cf3d70cf3ac757e0.jpg
                     * scene_name : 在路上
                     * bgpic_android :
                     * icon_android : http://c.hiphotos.baidu.com/ting/pic/item/b999a9014c086e06604a914805087bf40bd1cbd7.jpg
                     * scene_model : 2
                     * scene_desc :
                     * bgpic_ios :
                     * scene_id : 0
                     */

                    private String icon_ios;
                    private String scene_name;
                    private String bgpic_android;
                    private String icon_android;
                    private String scene_model;
                    private String scene_desc;
                    private String bgpic_ios;
                    private String scene_id;

                    public String getIcon_ios() {
                        return icon_ios;
                    }

                    public void setIcon_ios(String icon_ios) {
                        this.icon_ios = icon_ios;
                    }

                    public String getScene_name() {
                        return scene_name;
                    }

                    public void setScene_name(String scene_name) {
                        this.scene_name = scene_name;
                    }

                    public String getBgpic_android() {
                        return bgpic_android;
                    }

                    public void setBgpic_android(String bgpic_android) {
                        this.bgpic_android = bgpic_android;
                    }

                    public String getIcon_android() {
                        return icon_android;
                    }

                    public void setIcon_android(String icon_android) {
                        this.icon_android = icon_android;
                    }

                    public String getScene_model() {
                        return scene_model;
                    }

                    public void setScene_model(String scene_model) {
                        this.scene_model = scene_model;
                    }

                    public String getScene_desc() {
                        return scene_desc;
                    }

                    public void setScene_desc(String scene_desc) {
                        this.scene_desc = scene_desc;
                    }

                    public String getBgpic_ios() {
                        return bgpic_ios;
                    }

                    public void setBgpic_ios(String bgpic_ios) {
                        this.bgpic_ios = bgpic_ios;
                    }

                    public String getScene_id() {
                        return scene_id;
                    }

                    public void setScene_id(String scene_id) {
                        this.scene_id = scene_id;
                    }
                }

                public static class EmotionBean {
                    /**
                     * icon_ios : http://d.hiphotos.baidu.com/ting/pic/item/3bf33a87e950352a854306f85543fbf2b2118b1b.jpg
                     * scene_name : 激动
                     * bgpic_android :
                     * icon_android : http://b.hiphotos.baidu.com/ting/pic/item/5882b2b7d0a20cf4f1ac61dc71094b36acaf99f1.jpg
                     * scene_model : 1
                     * scene_desc :
                     * bgpic_ios :
                     * scene_id : 34
                     */

                    private String icon_ios;
                    private String scene_name;
                    private String bgpic_android;
                    private String icon_android;
                    private String scene_model;
                    private String scene_desc;
                    private String bgpic_ios;
                    private String scene_id;

                    public String getIcon_ios() {
                        return icon_ios;
                    }

                    public void setIcon_ios(String icon_ios) {
                        this.icon_ios = icon_ios;
                    }

                    public String getScene_name() {
                        return scene_name;
                    }

                    public void setScene_name(String scene_name) {
                        this.scene_name = scene_name;
                    }

                    public String getBgpic_android() {
                        return bgpic_android;
                    }

                    public void setBgpic_android(String bgpic_android) {
                        this.bgpic_android = bgpic_android;
                    }

                    public String getIcon_android() {
                        return icon_android;
                    }

                    public void setIcon_android(String icon_android) {
                        this.icon_android = icon_android;
                    }

                    public String getScene_model() {
                        return scene_model;
                    }

                    public void setScene_model(String scene_model) {
                        this.scene_model = scene_model;
                    }

                    public String getScene_desc() {
                        return scene_desc;
                    }

                    public void setScene_desc(String scene_desc) {
                        this.scene_desc = scene_desc;
                    }

                    public String getBgpic_ios() {
                        return bgpic_ios;
                    }

                    public void setBgpic_ios(String bgpic_ios) {
                        this.bgpic_ios = bgpic_ios;
                    }

                    public String getScene_id() {
                        return scene_id;
                    }

                    public void setScene_id(String scene_id) {
                        this.scene_id = scene_id;
                    }
                }

                public static class OperationBean {
                    /**
                     * icon_ios : http://a.hiphotos.baidu.com/ting/pic/item/d01373f082025aaff566d3a4fcedab64034f1a0c.jpg
                     * scene_name : 热歌
                     * bgpic_android :
                     * icon_android : http://a.hiphotos.baidu.com/ting/pic/item/838ba61ea8d3fd1f55b20f55374e251f95ca5f21.jpg
                     * scene_model : 1
                     * scene_desc :
                     * bgpic_ios :
                     * scene_id : 162
                     */

                    private String icon_ios;
                    private String scene_name;
                    private String bgpic_android;
                    private String icon_android;
                    private String scene_model;
                    private String scene_desc;
                    private String bgpic_ios;
                    private String scene_id;

                    public String getIcon_ios() {
                        return icon_ios;
                    }

                    public void setIcon_ios(String icon_ios) {
                        this.icon_ios = icon_ios;
                    }

                    public String getScene_name() {
                        return scene_name;
                    }

                    public void setScene_name(String scene_name) {
                        this.scene_name = scene_name;
                    }

                    public String getBgpic_android() {
                        return bgpic_android;
                    }

                    public void setBgpic_android(String bgpic_android) {
                        this.bgpic_android = bgpic_android;
                    }

                    public String getIcon_android() {
                        return icon_android;
                    }

                    public void setIcon_android(String icon_android) {
                        this.icon_android = icon_android;
                    }

                    public String getScene_model() {
                        return scene_model;
                    }

                    public void setScene_model(String scene_model) {
                        this.scene_model = scene_model;
                    }

                    public String getScene_desc() {
                        return scene_desc;
                    }

                    public void setScene_desc(String scene_desc) {
                        this.scene_desc = scene_desc;
                    }

                    public String getBgpic_ios() {
                        return bgpic_ios;
                    }

                    public void setBgpic_ios(String bgpic_ios) {
                        this.bgpic_ios = bgpic_ios;
                    }

                    public String getScene_id() {
                        return scene_id;
                    }

                    public void setScene_id(String scene_id) {
                        this.scene_id = scene_id;
                    }
                }

                public static class OtherBean {
                    /**
                     * icon_ios : http://c.hiphotos.baidu.com/ting/pic/item/b3b7d0a20cf431ad9bb26ac94d36acaf2fdd98d9.jpg
                     * scene_name : 流行
                     * bgpic_android :
                     * icon_android : http://b.hiphotos.baidu.com/ting/pic/item/a50f4bfbfbedab6443ffd5c3f036afc379311e27.jpg
                     * scene_model : 1
                     * scene_desc :
                     * bgpic_ios :
                     * scene_id : 48
                     */

                    private String icon_ios;
                    private String scene_name;
                    private String bgpic_android;
                    private String icon_android;
                    private String scene_model;
                    private String scene_desc;
                    private String bgpic_ios;
                    private String scene_id;

                    public String getIcon_ios() {
                        return icon_ios;
                    }

                    public void setIcon_ios(String icon_ios) {
                        this.icon_ios = icon_ios;
                    }

                    public String getScene_name() {
                        return scene_name;
                    }

                    public void setScene_name(String scene_name) {
                        this.scene_name = scene_name;
                    }

                    public String getBgpic_android() {
                        return bgpic_android;
                    }

                    public void setBgpic_android(String bgpic_android) {
                        this.bgpic_android = bgpic_android;
                    }

                    public String getIcon_android() {
                        return icon_android;
                    }

                    public void setIcon_android(String icon_android) {
                        this.icon_android = icon_android;
                    }

                    public String getScene_model() {
                        return scene_model;
                    }

                    public void setScene_model(String scene_model) {
                        this.scene_model = scene_model;
                    }

                    public String getScene_desc() {
                        return scene_desc;
                    }

                    public void setScene_desc(String scene_desc) {
                        this.scene_desc = scene_desc;
                    }

                    public String getBgpic_ios() {
                        return bgpic_ios;
                    }

                    public void setBgpic_ios(String bgpic_ios) {
                        this.bgpic_ios = bgpic_ios;
                    }

                    public String getScene_id() {
                        return scene_id;
                    }

                    public void setScene_id(String scene_id) {
                        this.scene_id = scene_id;
                    }
                }
            }

            public static class ConfigBean {
                /**
                 * color_other :
                 * play_color :
                 * scene_version : 0
                 * desc :
                 * end_time : 0
                 * start_time : 0
                 * scene_color :
                 * bgpic :
                 * bgpic_special :
                 * button_color :
                 */

                private String color_other;
                private String play_color;
                private int scene_version;
                private String desc;
                private int end_time;
                private int start_time;
                private String scene_color;
                private String bgpic;
                private String bgpic_special;
                private String button_color;

                public String getColor_other() {
                    return color_other;
                }

                public void setColor_other(String color_other) {
                    this.color_other = color_other;
                }

                public String getPlay_color() {
                    return play_color;
                }

                public void setPlay_color(String play_color) {
                    this.play_color = play_color;
                }

                public int getScene_version() {
                    return scene_version;
                }

                public void setScene_version(int scene_version) {
                    this.scene_version = scene_version;
                }

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public int getEnd_time() {
                    return end_time;
                }

                public void setEnd_time(int end_time) {
                    this.end_time = end_time;
                }

                public int getStart_time() {
                    return start_time;
                }

                public void setStart_time(int start_time) {
                    this.start_time = start_time;
                }

                public String getScene_color() {
                    return scene_color;
                }

                public void setScene_color(String scene_color) {
                    this.scene_color = scene_color;
                }

                public String getBgpic() {
                    return bgpic;
                }

                public void setBgpic(String bgpic) {
                    this.bgpic = bgpic;
                }

                public String getBgpic_special() {
                    return bgpic_special;
                }

                public void setBgpic_special(String bgpic_special) {
                    this.bgpic_special = bgpic_special;
                }

                public String getButton_color() {
                    return button_color;
                }

                public void setButton_color(String button_color) {
                    this.button_color = button_color;
                }
            }
        }

        public static class RecsongBean {
            /**
             * error_code : 22000
             * result : [{"resource_type_ext":"0","versions":"","info":"","learn":"0","copy_type":"1","has_filmtv":"0","pic_premium":"http://musicdata.baidu.com/data2/pic/123352353/123352353.jpg@s_0,w_500","title":"Open Season","song_id":"123352354","method":"4","has_mv_mobile":"0","bitrate_fee":"{\"0\":\"129|-1\",\"1\":\"-1|-1\"}","biaoshi":"vip","korean_bb_song":"0","del_status":"0","author":"Josef Salvat"},{"resource_type_ext":"0","versions":"","info":"","learn":"0","copy_type":"1","has_filmtv":"0","pic_premium":"http://musicdata.baidu.com/data2/pic/89782570/89782570.jpg@s_0,w_500","title":"坚持","song_id":"677850","method":"4","has_mv_mobile":"0","bitrate_fee":"{\"0\":\"129|-1\",\"1\":\"-1|-1\"}","biaoshi":"vip,lossless","korean_bb_song":"0","del_status":"0","author":"彭佳慧"},{"resource_type_ext":"1","versions":"","info":"","learn":"0","copy_type":"1","has_filmtv":"0","pic_premium":"http://musicdata.baidu.com/data2/pic/fe05d3c3d917021347f6a4f68670ad02/540418631/540418631.jpg@s_0,w_500","title":"旅程","song_id":"522741992","method":"4","has_mv_mobile":"1","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"-1|-1\"}","biaoshi":"king,vip,first,lossless","korean_bb_song":"0","del_status":"0","author":"魏晨"},{"resource_type_ext":"0","versions":"","info":"","learn":"1","copy_type":"1","has_filmtv":"0","pic_premium":"http://musicdata.baidu.com/data2/pic/66544ae04abc5871493eb66a912df05b/540055592/540055592.jpg@s_0,w_500","title":"少年","song_id":"600391","method":"4","has_mv_mobile":"0","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"lossless","korean_bb_song":"0","del_status":"0","author":"光良,曹格"},{"resource_type_ext":"0","versions":"","info":"","learn":"0","copy_type":"1","has_filmtv":"0","pic_premium":"http://musicdata.baidu.com/data2/lrc/540d7f2e0da7e28b1b59ae8d5ecbb246/543443266/543443266.jpg@s_0,w_500","title":"Cold Water","song_id":"543443323","method":"4","has_mv_mobile":"0","bitrate_fee":"{\"0\":\"129|-1\",\"1\":\"-1|-1\"}","biaoshi":"vip","korean_bb_song":"0","del_status":"0","author":"Major Lazer"},{"resource_type_ext":"0","versions":"","info":"","learn":"0","copy_type":"1","has_filmtv":"0","pic_premium":"http://musicdata.baidu.com/data2/pic/49e6161afb13e3eda9d1cb4e304561a2/267709272/267709272.jpg@s_0,w_500","title":"绅士","song_id":"241838066","method":"4","has_mv_mobile":"1","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"lossless","korean_bb_song":"0","del_status":"0","author":"薛之谦"},{"resource_type_ext":"0","versions":"","info":"","learn":"0","copy_type":"1","has_filmtv":"0","pic_premium":"http://musicdata.baidu.com/data2/pic/be912aac8d0326bea479489f5c3cd99c/297626849/297626849.jpg@s_0,w_500","title":"La Isla Bonita","song_id":"297627176","method":"4","has_mv_mobile":"0","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"lossless","korean_bb_song":"0","del_status":"0","author":"Antonio de Lucena,Madonna,S.Bray"},{"resource_type_ext":"0","versions":"","info":"","learn":"0","copy_type":"1","has_filmtv":"0","pic_premium":"http://musicdata.baidu.com/data2/music/E28C106800408BB2184CECC67A865EC6/254864932/254864932.jpg@s_0,w_500","title":"你的眼角流着我的泪","song_id":"120058148","method":"4","has_mv_mobile":"1","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"lossless","korean_bb_song":"0","del_status":"0","author":"门丽"},{"resource_type_ext":"0","versions":"","info":"电视剧《大开眼戒TVC》主题曲","learn":"1","copy_type":"1","has_filmtv":"0","pic_premium":"http://musicdata.baidu.com/data2/pic/124827092/124827092.jpg@s_0,w_500","title":"大开眼戒","song_id":"806574","method":"4","has_mv_mobile":"1","bitrate_fee":"{\"0\":\"129|-1\",\"1\":\"-1|-1\"}","biaoshi":"vip","korean_bb_song":"0","del_status":"0","author":"陈奕迅"},{"resource_type_ext":"1","versions":"","info":"","learn":"0","copy_type":"1","has_filmtv":"0","pic_premium":"http://musicdata.baidu.com/data2/pic/1472241c234c8dfb5abdcc51d2bf2a10/545926611/545926611.jpg@s_0,w_500","title":"轻轻的","song_id":"545926846","method":"4","has_mv_mobile":"0","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"-1|-1\"}","biaoshi":"king,vip","korean_bb_song":"1","del_status":"0","author":"冯建宇"},{"resource_type_ext":"0","versions":"","info":"","learn":"0","copy_type":"1","has_filmtv":"0","pic_premium":"http://musicdata.baidu.com/data2/pic/67f66c3c671f5e376ae7db18c960e308/541452135/541452135.jpg@s_0,w_500","title":"Tired","song_id":"541455871","method":"4","has_mv_mobile":"0","bitrate_fee":"{\"0\":\"129|-1\",\"1\":\"-1|-1\"}","biaoshi":"vip,first","korean_bb_song":"0","del_status":"0","author":"Alan Walker,Gavin James"},{"resource_type_ext":"0","versions":"","info":"","learn":"0","copy_type":"1","has_filmtv":"0","pic_premium":"http://musicdata.baidu.com/data2/pic/a073a57c7a7413da584606214d25430c/267171396/267171396.jpg@s_0,w_500","title":"心电感应808","song_id":"265676169","method":"4","has_mv_mobile":"0","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"lossless","korean_bb_song":"0","del_status":"0","author":"张靓颖"},{"resource_type_ext":"0","versions":"","info":"","learn":"0","copy_type":"1","has_filmtv":"0","pic_premium":"http://musicdata.baidu.com/data2/pic/77150778dd2b391c61f3f128f3315eef/544469384/544469384.jpg","title":"偏爱","song_id":"541724014","method":"4","has_mv_mobile":"0","bitrate_fee":"{\"0\":\"129|-1\",\"1\":\"-1|-1\"}","biaoshi":"vip,first,lossless","korean_bb_song":"0","del_status":"0","author":"曾沛慈"},{"resource_type_ext":"0","versions":"","info":"","learn":"0","copy_type":"1","has_filmtv":"0","pic_premium":"http://musicdata.baidu.com/data2/music/3F47050C96862E4B110F804CA595F082/252487525/252487525.jpg@s_0,w_500","title":"Honey? Money?","song_id":"7276139","method":"4","has_mv_mobile":"1","bitrate_fee":"{\"0\":\"129|-1\",\"1\":\"-1|-1\"}","biaoshi":"vip,lossless","korean_bb_song":"0","del_status":"0","author":"张惠春"},{"resource_type_ext":"0","versions":"","info":"","learn":"1","copy_type":"1","has_filmtv":"0","pic_premium":"http://musicdata.baidu.com/data2/pic/88388863/88388863.jpg@s_0,w_500","title":"需要人陪","song_id":"595456","method":"4","has_mv_mobile":"0","bitrate_fee":"{\"0\":\"129|-1\",\"1\":\"-1|-1\"}","biaoshi":"vip,lossless","korean_bb_song":"0","del_status":"0","author":"王力宏"},{"resource_type_ext":"0","versions":"","info":"电视剧《麻辣变形计第一季》主题曲","learn":"0","copy_type":"1","has_filmtv":"0","pic_premium":"http://musicdata.baidu.com/data2/pic/3b4a90a60a5cd9dd3fddda7f97b7ac95/268582553/268582553.jpg@s_0,w_500","title":"烈火神盾","song_id":"268582461","method":"4","has_mv_mobile":"0","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"lossless","korean_bb_song":"0","del_status":"0","author":"魏晨"},{"resource_type_ext":"0","versions":"","info":"","learn":"0","copy_type":"1","has_filmtv":"0","pic_premium":"http://musicdata.baidu.com/data2/pic/01dc8136b5feecca2b4cd5bc03ffec1a/540761095/540761095.jpg@s_0,w_500","title":"江湖晚","song_id":"540609176","method":"4","has_mv_mobile":"0","bitrate_fee":"{\"0\":\"129|-1\",\"1\":\"-1|-1\"}","biaoshi":"vip,first,lossless","korean_bb_song":"0","del_status":"0","author":"戴荃"},{"resource_type_ext":"0","versions":"","info":"","learn":"0","copy_type":"1","has_filmtv":"0","pic_premium":"http://musicdata.baidu.com/data2/pic/131695573/131695573.jpg@s_0,w_500","title":"一对对鸳鸯水上漂","song_id":"131696632","method":"4","has_mv_mobile":"1","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"lossless","korean_bb_song":"0","del_status":"0","author":"王二妮"},{"resource_type_ext":"0","versions":"","info":"","learn":"0","copy_type":"1","has_filmtv":"0","pic_premium":"http://musicdata.baidu.com/data2/pic/0205fceeb9b28f253fb5062331c3334b/279376596/279376596.jpg@s_0,w_500","title":"We Are The Champions (made famous by Queen)","song_id":"279377341","method":"4","has_mv_mobile":"0","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"lossless","korean_bb_song":"0","del_status":"0","author":"Various Artists,Queen,St. Martin\u2019s Symphony Of Los Angeles"},{"resource_type_ext":"0","versions":"","info":"","learn":"0","copy_type":"1","has_filmtv":"0","pic_premium":"http://musicdata.baidu.com/data2/music/4C15C485BE2E89B619EE13273B323C4C/253166074/253166074.jpg@s_0,w_500","title":"改造人","song_id":"17644324","method":"4","has_mv_mobile":"1","bitrate_fee":"{\"0\":\"129|-1\",\"1\":\"-1|-1\"}","biaoshi":"vip,lossless","korean_bb_song":"0","del_status":"0","author":"谢霆锋"}]
             */

            private int error_code;
            private List<ResultBeanXXXX> result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ResultBeanXXXX> getResult() {
                return result;
            }

            public void setResult(List<ResultBeanXXXX> result) {
                this.result = result;
            }

            public static class ResultBeanXXXX {
                /**
                 * resource_type_ext : 0
                 * versions :
                 * info :
                 * learn : 0
                 * copy_type : 1
                 * has_filmtv : 0
                 * pic_premium : http://musicdata.baidu.com/data2/pic/123352353/123352353.jpg@s_0,w_500
                 * title : Open Season
                 * song_id : 123352354
                 * method : 4
                 * has_mv_mobile : 0
                 * bitrate_fee : {"0":"129|-1","1":"-1|-1"}
                 * biaoshi : vip
                 * korean_bb_song : 0
                 * del_status : 0
                 * author : Josef Salvat
                 */

                private String resource_type_ext;
                private String versions;
                private String info;
                private String learn;
                private String copy_type;
                private String has_filmtv;
                private String pic_premium;
                private String title;
                private String song_id;
                private String method;
                private String has_mv_mobile;
                private String bitrate_fee;
                private String biaoshi;
                private String korean_bb_song;
                private String del_status;
                private String author;

                public String getResource_type_ext() {
                    return resource_type_ext;
                }

                public void setResource_type_ext(String resource_type_ext) {
                    this.resource_type_ext = resource_type_ext;
                }

                public String getVersions() {
                    return versions;
                }

                public void setVersions(String versions) {
                    this.versions = versions;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getLearn() {
                    return learn;
                }

                public void setLearn(String learn) {
                    this.learn = learn;
                }

                public String getCopy_type() {
                    return copy_type;
                }

                public void setCopy_type(String copy_type) {
                    this.copy_type = copy_type;
                }

                public String getHas_filmtv() {
                    return has_filmtv;
                }

                public void setHas_filmtv(String has_filmtv) {
                    this.has_filmtv = has_filmtv;
                }

                public String getPic_premium() {
                    return pic_premium;
                }

                public void setPic_premium(String pic_premium) {
                    this.pic_premium = pic_premium;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getSong_id() {
                    return song_id;
                }

                public void setSong_id(String song_id) {
                    this.song_id = song_id;
                }

                public String getMethod() {
                    return method;
                }

                public void setMethod(String method) {
                    this.method = method;
                }

                public String getHas_mv_mobile() {
                    return has_mv_mobile;
                }

                public void setHas_mv_mobile(String has_mv_mobile) {
                    this.has_mv_mobile = has_mv_mobile;
                }

                public String getBitrate_fee() {
                    return bitrate_fee;
                }

                public void setBitrate_fee(String bitrate_fee) {
                    this.bitrate_fee = bitrate_fee;
                }

                public String getBiaoshi() {
                    return biaoshi;
                }

                public void setBiaoshi(String biaoshi) {
                    this.biaoshi = biaoshi;
                }

                public String getKorean_bb_song() {
                    return korean_bb_song;
                }

                public void setKorean_bb_song(String korean_bb_song) {
                    this.korean_bb_song = korean_bb_song;
                }

                public String getDel_status() {
                    return del_status;
                }

                public void setDel_status(String del_status) {
                    this.del_status = del_status;
                }

                public String getAuthor() {
                    return author;
                }

                public void setAuthor(String author) {
                    this.author = author;
                }
            }
        }

        public static class Mix9Bean {
            /**
             * error_code : 22000
             * result : [{"desc":"","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500867735325c48e9f337440855b5d36038cced86.jpg","type_id":"http://y.baidu.com/cms/topic/webapp/2017/anzi/index.html","type":4,"title":"永远唱下去，是我们从未变过的音乐梦想","tip_type":0,"author":""},{"desc":"","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1499667154777477c24985f130fd1be67257d7f5e9.jpg","type_id":"http://y.baidu.com/tbang/","type":4,"title":"TBANG榜单揭晓","tip_type":0,"author":""},{"desc":"","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1495188132696c6e7e59686e0ed03804c2dc2e0dd5.jpg","type_id":"http://music.baidu.com/cms/webview/song_vote/ws/index.html","type":4,"title":"麦克成风2017赛季启动，城市投票赛ing","tip_type":0,"author":""}]
             */

            private int error_code;
            private List<ResultBeanXXXXX> result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ResultBeanXXXXX> getResult() {
                return result;
            }

            public void setResult(List<ResultBeanXXXXX> result) {
                this.result = result;
            }

            public static class ResultBeanXXXXX {
                /**
                 * desc :
                 * pic : http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500867735325c48e9f337440855b5d36038cced86.jpg
                 * type_id : http://y.baidu.com/cms/topic/webapp/2017/anzi/index.html
                 * type : 4
                 * title : 永远唱下去，是我们从未变过的音乐梦想
                 * tip_type : 0
                 * author :
                 */

                private String desc;
                private String pic;
                private String type_id;
                private int type;
                private String title;
                private int tip_type;
                private String author;

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getTip_type() {
                    return tip_type;
                }

                public void setTip_type(int tip_type) {
                    this.tip_type = tip_type;
                }

                public String getAuthor() {
                    return author;
                }

                public void setAuthor(String author) {
                    this.author = author;
                }
            }
        }

        public static class Mix83Bean {
            /**
             * error_code : 22000
             * result : [{"desc":"","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500878800309fdcf6cfcf35dc413d8926a9f05324.jpg","type_id":"544272971","type":2,"title":"摇滚又一榜","tip_type":0,"author":""},{"desc":"","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500882235e7eae72660b1d2e30ce2e899406c72b2.jpg","type_id":"543761037","type":2,"title":"日谈公园","tip_type":0,"author":""},{"desc":"","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500885189392fe1017a7a8689e9870dc6a749e5d8.jpg","type_id":"543811138","type":2,"title":"坏蛋调频","tip_type":0,"author":""},{"desc":"","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_150088165633c727663b4473b9426c5eae550ebc8c.jpg","type_id":"11164009","type":3,"title":"做一个单纯而努力的人","tip_type":0,"author":""},{"desc":"","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500881572d0440f8184078957788f2adb1e0d7dc7.jpg","type_id":"13384406","type":3,"title":"致林肯公园的查斯特·贝宁顿","tip_type":0,"author":""},{"desc":"","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_150088108637deedfbc0d509e057389ed7141cd008.jpg","type_id":"12380577","type":3,"title":"永远到底有多远","tip_type":0,"author":""}]
             */

            private int error_code;
            private List<ResultBeanXXXXXX> result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ResultBeanXXXXXX> getResult() {
                return result;
            }

            public void setResult(List<ResultBeanXXXXXX> result) {
                this.result = result;
            }

            public static class ResultBeanXXXXXX {
                /**
                 * desc :
                 * pic : http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500878800309fdcf6cfcf35dc413d8926a9f05324.jpg
                 * type_id : 544272971
                 * type : 2
                 * title : 摇滚又一榜
                 * tip_type : 0
                 * author :
                 */

                private String desc;
                private String pic;
                private String type_id;
                private int type;
                private String title;
                private int tip_type;
                private String author;

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getTip_type() {
                    return tip_type;
                }

                public void setTip_type(int tip_type) {
                    this.tip_type = tip_type;
                }

                public String getAuthor() {
                    return author;
                }

                public void setAuthor(String author) {
                    this.author = author;
                }
            }
        }

        public static class Mix22Bean {
            /**
             * error_code : 22000
             * result : [{"desc":"旅行团乐队","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_14993104941a77a4ead01058192aba919301be8487.jpg","type_id":"543981425","type":2,"title":"永远都会在","tip_type":0,"author":"旅行团乐队"},{"desc":"小太空","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1498022208a5a1908021390b7eed99fa1a09d38575.jpg","type_id":"542032233","type":2,"title":"Faye飞","tip_type":0,"author":"Faye飞"},{"desc":"刘瑞琦","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_14951617795e40f8c0aa3c6fd249f249f08791a8e1.jpg","type_id":"541297473","type":2,"title":"晚安，琦","tip_type":0,"author":"刘瑞琦"}]
             */

            private int error_code;
            private List<ResultBeanXXXXXXX> result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ResultBeanXXXXXXX> getResult() {
                return result;
            }

            public void setResult(List<ResultBeanXXXXXXX> result) {
                this.result = result;
            }

            public static class ResultBeanXXXXXXX {
                /**
                 * desc : 旅行团乐队
                 * pic : http://business.cdn.qianqian.com/qianqian/pic/bos_client_14993104941a77a4ead01058192aba919301be8487.jpg
                 * type_id : 543981425
                 * type : 2
                 * title : 永远都会在
                 * tip_type : 0
                 * author : 旅行团乐队
                 */

                private String desc;
                private String pic;
                private String type_id;
                private int type;
                private String title;
                private int tip_type;
                private String author;

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getTip_type() {
                    return tip_type;
                }

                public void setTip_type(int tip_type) {
                    this.tip_type = tip_type;
                }

                public String getAuthor() {
                    return author;
                }

                public void setAuthor(String author) {
                    this.author = author;
                }
            }
        }

        public static class Mix71Bean {
            /**
             * error_code : 22000
             * result : [{"desc":"","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1498818225c1f5c0d530c5a209f981b2e763a7b413.jpg","type_id":"0","type":100,"title":"今日推荐","tip_type":0,"author":""},{"desc":"","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_149881824569584d72e3ff23278f7b4018b22f94e4.jpg","type_id":"2","type":100,"title":"歌手","tip_type":0,"author":""},{"desc":"","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_14988294001b1b3894bd3e46494abd82a9fb654097.jpg","type_id":"9","type":100,"title":"会员专区","tip_type":0,"author":""},{"desc":"","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500284739d22e2b7c217b091c3349bfa9a940caaa.jpg","type_id":"http://music.baidu.com/cms/webview/ticket2017/index.html","type":4,"title":"票务活动","tip_type":0,"author":""}]
             */

            private int error_code;
            private List<ResultBeanXXXXXXXX> result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ResultBeanXXXXXXXX> getResult() {
                return result;
            }

            public void setResult(List<ResultBeanXXXXXXXX> result) {
                this.result = result;
            }

            public static class ResultBeanXXXXXXXX {
                /**
                 * desc :
                 * pic : http://business.cdn.qianqian.com/qianqian/pic/bos_client_1498818225c1f5c0d530c5a209f981b2e763a7b413.jpg
                 * type_id : 0
                 * type : 100
                 * title : 今日推荐
                 * tip_type : 0
                 * author :
                 */

                private String desc;
                private String pic;
                private String type_id;
                private int type;
                private String title;
                private int tip_type;
                private String author;

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getTip_type() {
                    return tip_type;
                }

                public void setTip_type(int tip_type) {
                    this.tip_type = tip_type;
                }

                public String getAuthor() {
                    return author;
                }

                public void setAuthor(String author) {
                    this.author = author;
                }
            }
        }

        public static class KingBean {
            /**
             * error_code : 22000
             * result : [{"pic_big":"http://musicdata.baidu.com/data2/pic/eb3bb619bdf02ab57cc86a47187af013/541463581/541463581.jpg@s_0,w_150","title":"敢爱就来","author":"冯建宇"},{"pic_big":"http://musicdata.baidu.com/data2/pic/0f1f232f9e6f921a595c1e4a076473c2/542052591/542052591.jpg@s_0,w_150","title":"上海LOCKING","author":"十二星宿风之少年"},{"pic_big":"http://musicdata.baidu.com/data2/pic/9d4faa13282c9d6beea41f479448f259/540090993/540090993.jpg@s_0,w_150","title":"拿不走的记忆","author":"迪玛希"}]
             */

            private int error_code;
            private List<ResultBeanXXXXXXXXX> result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ResultBeanXXXXXXXXX> getResult() {
                return result;
            }

            public void setResult(List<ResultBeanXXXXXXXXX> result) {
                this.result = result;
            }

            public static class ResultBeanXXXXXXXXX {
                /**
                 * pic_big : http://musicdata.baidu.com/data2/pic/eb3bb619bdf02ab57cc86a47187af013/541463581/541463581.jpg@s_0,w_150
                 * title : 敢爱就来
                 * author : 冯建宇
                 */

                private String pic_big;
                private String title;
                private String author;

                public String getPic_big() {
                    return pic_big;
                }

                public void setPic_big(String pic_big) {
                    this.pic_big = pic_big;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getAuthor() {
                    return author;
                }

                public void setAuthor(String author) {
                    this.author = author;
                }
            }
        }

        public static class Mix61Bean {
            /**
             * error_code : 22000
             * result : [{"desc":"东风日产×百度音乐","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500398969ca8beef2f05964af04f609506712220d.jpg","type_id":"http://music.baidu.com/cms/webview/topic_activity/plazanissan/index.html?showminibar=0&hideplay=1","type":4,"title":"突破次元·理想音乐第三季","tip_type":0,"author":"东风日产×百度音乐"},{"desc":"耀乐团/洛天依","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_14983950160158e275e13c93aff6e51b53ddbabfb7.jpg","type_id":"543817814","type":2,"title":"光速行者","tip_type":0,"author":"耀乐团/洛天依"},{"desc":"东风日产×百度音乐","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_149874186641d5837a9a190b4f5d3ab2700ba30ded.jpg","type_id":"http://music.baidu.com/cms/webview/song_vote/dfrc/index.html","type":4,"title":"X-Voice次元偶像大赛火热报名中！","tip_type":0,"author":"东风日产×百度音乐"}]
             */

            private int error_code;
            private List<ResultBeanXXXXXXXXXX> result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ResultBeanXXXXXXXXXX> getResult() {
                return result;
            }

            public void setResult(List<ResultBeanXXXXXXXXXX> result) {
                this.result = result;
            }

            public static class ResultBeanXXXXXXXXXX {
                /**
                 * desc : 东风日产×百度音乐
                 * pic : http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500398969ca8beef2f05964af04f609506712220d.jpg
                 * type_id : http://music.baidu.com/cms/webview/topic_activity/plazanissan/index.html?showminibar=0&hideplay=1
                 * type : 4
                 * title : 突破次元·理想音乐第三季
                 * tip_type : 0
                 * author : 东风日产×百度音乐
                 */

                private String desc;
                private String pic;
                private String type_id;
                private int type;
                private String title;
                private int tip_type;
                private String author;

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getTip_type() {
                    return tip_type;
                }

                public void setTip_type(int tip_type) {
                    this.tip_type = tip_type;
                }

                public String getAuthor() {
                    return author;
                }

                public void setAuthor(String author) {
                    this.author = author;
                }
            }
        }

        public static class NewSongBean {
            /**
             * error_code : 22000
             * result : {"pic_500":"http://b.hiphotos.baidu.com/ting/pic/item/a50f4bfbfbedab64bcae572ef136afc378311e7b.jpg","listid":"5126","song_info":[{"song_id":"261812117","title":"二十四小时","pic_premium":"http://qukufile2.qianqian.com/data2/pic/261811991/261811991.jpg@s_0,w_500","author":"陈坤,韩庚,大鹏,吴磊,尹正"},{"song_id":"74109283","title":"灵主不悔《画江湖之灵主》手游暨动漫主题曲","author":"汪苏泷"},{"song_id":"261496612","title":"Protocole","pic_premium":"http://qukufile2.qianqian.com/data2/pic/07a830e962bbb4e58e29842f45d44b66/261496583/261496583.jpg@s_0,w_500","author":"Alpha Wann"}]}
             */

            private int error_code;
            private ResultBeanXXXXXXXXXXX result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public ResultBeanXXXXXXXXXXX getResult() {
                return result;
            }

            public void setResult(ResultBeanXXXXXXXXXXX result) {
                this.result = result;
            }

            public static class ResultBeanXXXXXXXXXXX {
                /**
                 * pic_500 : http://b.hiphotos.baidu.com/ting/pic/item/a50f4bfbfbedab64bcae572ef136afc378311e7b.jpg
                 * listid : 5126
                 * song_info : [{"song_id":"261812117","title":"二十四小时","pic_premium":"http://qukufile2.qianqian.com/data2/pic/261811991/261811991.jpg@s_0,w_500","author":"陈坤,韩庚,大鹏,吴磊,尹正"},{"song_id":"74109283","title":"灵主不悔《画江湖之灵主》手游暨动漫主题曲","author":"汪苏泷"},{"song_id":"261496612","title":"Protocole","pic_premium":"http://qukufile2.qianqian.com/data2/pic/07a830e962bbb4e58e29842f45d44b66/261496583/261496583.jpg@s_0,w_500","author":"Alpha Wann"}]
                 */

                private String pic_500;
                private String listid;
                private List<SongInfoBean> song_info;

                public String getPic_500() {
                    return pic_500;
                }

                public void setPic_500(String pic_500) {
                    this.pic_500 = pic_500;
                }

                public String getListid() {
                    return listid;
                }

                public void setListid(String listid) {
                    this.listid = listid;
                }

                public List<SongInfoBean> getSong_info() {
                    return song_info;
                }

                public void setSong_info(List<SongInfoBean> song_info) {
                    this.song_info = song_info;
                }

                public static class SongInfoBean {
                    /**
                     * song_id : 261812117
                     * title : 二十四小时
                     * pic_premium : http://qukufile2.qianqian.com/data2/pic/261811991/261811991.jpg@s_0,w_500
                     * author : 陈坤,韩庚,大鹏,吴磊,尹正
                     */

                    private String song_id;
                    private String title;
                    private String pic_premium;
                    private String author;

                    public String getSong_id() {
                        return song_id;
                    }

                    public void setSong_id(String song_id) {
                        this.song_id = song_id;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getPic_premium() {
                        return pic_premium;
                    }

                    public void setPic_premium(String pic_premium) {
                        this.pic_premium = pic_premium;
                    }

                    public String getAuthor() {
                        return author;
                    }

                    public void setAuthor(String author) {
                        this.author = author;
                    }
                }
            }
        }

        public static class RadioBean {
            /**
             * error_code : 22000
             * result : [{"desc":"音乐推荐","itemid":"13496780","title":"有待咖啡","album_id":"13420707","type":"lebo","channelid":"11373552","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_019d01e1e994ba4e9d7890d9fc97f9eb.jpg"},{"desc":"音乐推荐","itemid":"13496374","title":"这样的罗大佑，你可能不太熟","album_id":"5945591","type":"lebo","channelid":"11373552","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_7894c83e731b9a8f4954fab18694db81.jpg"},{"desc":"都市情感","itemid":"13472541","title":"人生：十二年一个圆满或者缺憾","album_id":"12774274","type":"lebo","channelid":"11373553","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_01273c7cc2c630d44cbfd62d42a4c805.jpg"},{"desc":"段子笑话","itemid":"13497641","title":"胖友说，留言前100名让我带大家去吃小龙虾","album_id":"12380502","type":"lebo","channelid":"11373552","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_df5523f3cfd5a3266d669e085b5f1a5a.jpg"},{"desc":"音乐推荐","itemid":"13484227","title":"罗大佑丨光阴带走青春，留下了故事","album_id":"13384406","type":"lebo","channelid":"11373552","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1e1f1cd57cd27d41a4d7eba22deb94ea.jpg"},{"desc":"教育","itemid":"13487126","title":"《小学生必背古诗词70+80》20：九月九日忆山东兄弟","album_id":"13483086","type":"lebo","channelid":"11373555","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_7d8839a780a4d599e245cefcebdd1d70.jpg"}]
             */

            private int error_code;
            private List<ResultBeanXXXXXXXXXXXX> result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ResultBeanXXXXXXXXXXXX> getResult() {
                return result;
            }

            public void setResult(List<ResultBeanXXXXXXXXXXXX> result) {
                this.result = result;
            }

            public static class ResultBeanXXXXXXXXXXXX {
                /**
                 * desc : 音乐推荐
                 * itemid : 13496780
                 * title : 有待咖啡
                 * album_id : 13420707
                 * type : lebo
                 * channelid : 11373552
                 * pic : http://business.cdn.qianqian.com/qianqian/pic/bos_client_019d01e1e994ba4e9d7890d9fc97f9eb.jpg
                 */

                private String desc;
                private String itemid;
                private String title;
                private String album_id;
                private String type;
                private String channelid;
                private String pic;

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getItemid() {
                    return itemid;
                }

                public void setItemid(String itemid) {
                    this.itemid = itemid;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getAlbum_id() {
                    return album_id;
                }

                public void setAlbum_id(String album_id) {
                    this.album_id = album_id;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getChannelid() {
                    return channelid;
                }

                public void setChannelid(String channelid) {
                    this.channelid = channelid;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }
            }
        }

        public static class ShowListBean {
            /**
             * error_code : 22000
             * result : [{"type":"learn","picture_iphone6":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_2bc81ed7070a7db830a9c8309080d2f4.jpg","picture":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_2b983ddd40a431e1b66a6cb290f0a770.jpg","web_url":"http://music.baidu.com/cms/webview/ktv_activity/20170112/"}]
             */

            private int error_code;
            private List<ResultBeanXXXXXXXXXXXXX> result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ResultBeanXXXXXXXXXXXXX> getResult() {
                return result;
            }

            public void setResult(List<ResultBeanXXXXXXXXXXXXX> result) {
                this.result = result;
            }

            public static class ResultBeanXXXXXXXXXXXXX {
                /**
                 * type : learn
                 * picture_iphone6 : http://business.cdn.qianqian.com/qianqian/pic/bos_client_2bc81ed7070a7db830a9c8309080d2f4.jpg
                 * picture : http://business.cdn.qianqian.com/qianqian/pic/bos_client_2b983ddd40a431e1b66a6cb290f0a770.jpg
                 * web_url : http://music.baidu.com/cms/webview/ktv_activity/20170112/
                 */

                private String type;
                private String picture_iphone6;
                private String picture;
                private String web_url;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getPicture_iphone6() {
                    return picture_iphone6;
                }

                public void setPicture_iphone6(String picture_iphone6) {
                    this.picture_iphone6 = picture_iphone6;
                }

                public String getPicture() {
                    return picture;
                }

                public void setPicture(String picture) {
                    this.picture = picture;
                }

                public String getWeb_url() {
                    return web_url;
                }

                public void setWeb_url(String web_url) {
                    this.web_url = web_url;
                }
            }
        }

        public static class Mod50Bean {
            /**
             * error_code : 22000
             * result : [{"desc":"陈惠婷","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_15009566193d8bde1c0e171cf57b546e810d8defbb.jpg","type_id":"548469220","type":2,"title":"记忆边境","tip_type":0,"author":"陈惠婷"},{"desc":"李若溪","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_150088687058c98873a4f74e9bf8ee7945e20ce727.jpg","type_id":"548190928","type":5,"title":"滂沱大雨里（《我的前半生》电视剧歌曲）","tip_type":0,"author":"李若溪"},{"desc":"郁可唯","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_15006254838d2f97253230843648b2900df67f0b38.jpg","type_id":"547198352","type":5,"title":"未至","tip_type":0,"author":"郁可唯"},{"desc":"胡宇威","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_150061810284bb330be9b7269da0e4e5c559894c63.jpg","type_id":"547150576","type":5,"title":"请不要打扰我们的爱","tip_type":0,"author":"胡宇威"}]
             */

            private int error_code;
            private List<ResultBeanXXXXXXXXXXXXXX> result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ResultBeanXXXXXXXXXXXXXX> getResult() {
                return result;
            }

            public void setResult(List<ResultBeanXXXXXXXXXXXXXX> result) {
                this.result = result;
            }

            public static class ResultBeanXXXXXXXXXXXXXX {
                /**
                 * desc : 陈惠婷
                 * pic : http://business.cdn.qianqian.com/qianqian/pic/bos_client_15009566193d8bde1c0e171cf57b546e810d8defbb.jpg
                 * type_id : 548469220
                 * type : 2
                 * title : 记忆边境
                 * tip_type : 0
                 * author : 陈惠婷
                 */

                private String desc;
                private String pic;
                private String type_id;
                private int type;
                private String title;
                private int tip_type;
                private String author;

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getTip_type() {
                    return tip_type;
                }

                public void setTip_type(int tip_type) {
                    this.tip_type = tip_type;
                }

                public String getAuthor() {
                    return author;
                }

                public void setAuthor(String author) {
                    this.author = author;
                }
            }
        }

        public static class FocusBean {
            /**
             * error_code : 22000
             * result : [{"randpic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_150078107210dbae9681af9e40344c4bf675a0cdec.jpg","code":"http://music.baidu.com/cms/webview/topic_activity/dfzl02/","mo_type":4,"type":6,"is_publish":"111111","randpic_iphone6":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_150078107210dbae9681af9e40344c4bf675a0cdec.jpg","randpic_desc":""},{"randpic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500977749e26f17f289cdfe7fc03c694d98e7eab2.jpg","code":"http://music.baidu.com/h5pc/spec_detail?id=543&columnid=87","mo_type":4,"type":6,"is_publish":"111111","randpic_iphone6":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500977749e26f17f289cdfe7fc03c694d98e7eab2.jpg","randpic_desc":"MUSICHOT87 | 关于Linkin Park最后的纪念"},{"randpic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500977934b6ef8bd5cef1ce6db9731abefa158f3d.jpg","code":"http://music.baidu.com/h5pc/spec_detail?id=545&columnid=84","mo_type":4,"type":6,"is_publish":"111111","randpic_iphone6":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500977934b6ef8bd5cef1ce6db9731abefa158f3d.jpg","randpic_desc":"SNH48的私房歌单：粉红少女给你夏日清凉"},{"randpic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500958056b1846959c2fbb425b4a759c7fddbd53e.jpg","code":"http://music.baidu.com/h5pc/spec_detail?id=542&columnid=128","mo_type":4,"type":6,"is_publish":"111111","randpic_iphone6":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500958056b1846959c2fbb425b4a759c7fddbd53e.jpg","randpic_desc":"vol.433 看得见音乐的城市pt.10 台北篇"},{"randpic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500952214b2190d3a230fa8afd2e8c25478fa67fa.jpg","code":"548214291","mo_type":2,"type":2,"is_publish":"111111","randpic_iphone6":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500952214b2190d3a230fa8afd2e8c25478fa67fa.jpg","randpic_desc":""},{"randpic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500976446b2e04bfb94ce24f0cbc273f993018e40.jpg","code":"http://music.baidu.com/h5pc/spec_detail?id=547&columnid=95","mo_type":4,"type":6,"is_publish":"111111","randpic_iphone6":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500976446b2e04bfb94ce24f0cbc273f993018e40.jpg","randpic_desc":"英国金属核班霸While She Sleeps携新专再度来华"},{"randpic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500892009413164fb5d3b3c869fc8e30858f22def.jpg","code":"http://music.baidu.com/h5pc/spec_detail?id=544&columnid=115","mo_type":4,"type":6,"is_publish":"111111","randpic_iphone6":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500892009413164fb5d3b3c869fc8e30858f22def.jpg","randpic_desc":"快男第七期"},{"randpic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500973903d1f1f90ccacf824bfc87aa71d5e7ee12.jpg","code":"http://music.baidu.com/cms/webview/ticket2017/info.html?aid=38&from=singlemessage","mo_type":4,"type":6,"is_publish":"111111","randpic_iphone6":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500973903d1f1f90ccacf824bfc87aa71d5e7ee12.jpg","randpic_desc":"建军大业VIP"}]
             */

            private int error_code;
            private List<ResultBeanXXXXXXXXXXXXXXX> result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ResultBeanXXXXXXXXXXXXXXX> getResult() {
                return result;
            }

            public void setResult(List<ResultBeanXXXXXXXXXXXXXXX> result) {
                this.result = result;
            }

            public static class ResultBeanXXXXXXXXXXXXXXX {
                /**
                 * randpic : http://business.cdn.qianqian.com/qianqian/pic/bos_client_150078107210dbae9681af9e40344c4bf675a0cdec.jpg
                 * code : http://music.baidu.com/cms/webview/topic_activity/dfzl02/
                 * mo_type : 4
                 * type : 6
                 * is_publish : 111111
                 * randpic_iphone6 : http://business.cdn.qianqian.com/qianqian/pic/bos_client_150078107210dbae9681af9e40344c4bf675a0cdec.jpg
                 * randpic_desc :
                 */

                private String randpic;
                private String code;
                private int mo_type;
                private int type;
                private String is_publish;
                private String randpic_iphone6;
                private String randpic_desc;

                public String getRandpic() {
                    return randpic;
                }

                public void setRandpic(String randpic) {
                    this.randpic = randpic;
                }

                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public int getMo_type() {
                    return mo_type;
                }

                public void setMo_type(int mo_type) {
                    this.mo_type = mo_type;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getIs_publish() {
                    return is_publish;
                }

                public void setIs_publish(String is_publish) {
                    this.is_publish = is_publish;
                }

                public String getRandpic_iphone6() {
                    return randpic_iphone6;
                }

                public void setRandpic_iphone6(String randpic_iphone6) {
                    this.randpic_iphone6 = randpic_iphone6;
                }

                public String getRandpic_desc() {
                    return randpic_desc;
                }

                public void setRandpic_desc(String randpic_desc) {
                    this.randpic_desc = randpic_desc;
                }
            }
        }

        public static class DiyBean {
            /**
             * error_code : 22000
             * result : [{"desc":"","pic":"http://musicugc.cdn.qianqian.com/ugcdiy/pic/7b8a137ae642feaf59f9fdca8a166e2d.jpg","title":"让你元气满满的欢脱节奏","type":0,"type_id":"365541765","tip_type":0,"author":""},{"desc":"","pic":"http://musicugc.cdn.qianqian.com/ugcdiy/pic/9ba21649d19b88a89fd53af10a342c16.jpg","title":"pop-punk|朋克不是少数人的专利","type":0,"type_id":"401919196","tip_type":0,"author":""},{"desc":"","pic":"http://musicugc.cdn.qianqian.com/ugcdiy/pic/44ad8d27768dd6f1622d41b75ee47324.jpg","title":"【突破次元】超神必备游戏专用BGM","type":0,"type_id":"367204706","tip_type":0,"author":""},{"desc":"","pic":"http://musicugc.cdn.qianqian.com/ugcdiy/pic/497a1d6af6ed8cb2a1ae436721e33fcf.jpg","title":"古风|戏子无情，却缘定倾心","type":0,"type_id":"405500598","tip_type":0,"author":""},{"desc":"","pic":"http://musicugc.cdn.qianqian.com/ugcdiy/pic/5bd3955719873d08d0d44f69009f6d1f.jpg","title":"【突破次元】经典日式剧情游戏用曲","type":0,"type_id":"481809952","tip_type":0,"author":""},{"desc":"","pic":"http://musicugc.cdn.qianqian.com/ugcdiy/pic/7375d676c59dc1073ec0bbe9fa808124.jpg","title":"别了，我们的少年时代","type":0,"type_id":"402171275","tip_type":0,"author":""}]
             */

            private int error_code;
            private List<ResultBeanXXXXXXXXXXXXXXXX> result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ResultBeanXXXXXXXXXXXXXXXX> getResult() {
                return result;
            }

            public void setResult(List<ResultBeanXXXXXXXXXXXXXXXX> result) {
                this.result = result;
            }

            public static class ResultBeanXXXXXXXXXXXXXXXX {
                /**
                 * desc :
                 * pic : http://musicugc.cdn.qianqian.com/ugcdiy/pic/7b8a137ae642feaf59f9fdca8a166e2d.jpg
                 * title : 让你元气满满的欢脱节奏
                 * type : 0
                 * type_id : 365541765
                 * tip_type : 0
                 * author :
                 */

                private String desc;
                private String pic;
                private String title;
                private int type;
                private String type_id;
                private int tip_type;
                private String author;

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public int getTip_type() {
                    return tip_type;
                }

                public void setTip_type(int tip_type) {
                    this.tip_type = tip_type;
                }

                public String getAuthor() {
                    return author;
                }

                public void setAuthor(String author) {
                    this.author = author;
                }
            }
        }

        public static class Mix72Bean {
            /**
             * error_code : 22000
             * result : [{"desc":"一周音乐热 | 网罗一周乐坛动态！","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500978694e26f17f289cdfe7fc03c694d98e7eab2.jpg","type_id":"http://music.baidu.com/h5pc/spec_detail?id=543&columnid=87","type":4,"title":"MUSICHOT87 | 关于Linkin Park最后的纪念","tip_type":0,"author":""},{"desc":"","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_150056008010dbae9681af9e40344c4bf675a0cdec.jpg","type_id":"http://music.baidu.com/cms/webview/topic_activity/dfzl02/","type":4,"title":"二次元音乐里的那些传奇和新秀：制作人篇","tip_type":0,"author":""},{"desc":"百度音乐独家DJ节目《音乐风格馆》 | 第五期","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500476559219b133b0509da20bfea6299f5b10926.jpg","type_id":"http://music.baidu.com/cms/webview/topic_activity/dffgg02/","type":4,"title":"ZERO-G和你聊聊90后眼中的二次元音乐","tip_type":0,"author":""},{"desc":"音乐大人物 | 带给你绝妙的音乐，独特的故事","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_15007040059aca9f5413a2a29d4ec330e4972c22fe.jpg","type_id":"http://music.baidu.com/h5pc/spec_detail?id=535&columnid=92","type":4,"title":"\u201c小迷糊\u201d张靓颖： 洗面奶当成牙膏 上厕所错过演出","tip_type":0,"author":""},{"desc":"《大内密谈》入驻百度音乐","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500962888b1846959c2fbb425b4a759c7fddbd53e.jpg","type_id":"http://music.baidu.com/h5pc/spec_detail?id=542&columnid=128","type":4,"title":"vol.433 看得见音乐的城市pt.10 台北篇","tip_type":0,"author":""},{"desc":"爱豆SHOW VOL.34 | 带你跟进新、热idol和话题的脚步","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_150061892043989c78949622f9c19d334bd6229530.jpg","type_id":"http://music.baidu.com/h5pc/spec_detail?id=534&columnid=86","type":4,"title":"对不起！我只知道R&B！","tip_type":0,"author":""},{"desc":"明星私房歌","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500977963b6ef8bd5cef1ce6db9731abefa158f3d.jpg","type_id":"http://music.baidu.com/h5pc/spec_detail?id=545&columnid=84","type":4,"title":"SNH48的私房歌单：粉红少女给你夏日清凉","tip_type":0,"author":""},{"desc":"刘力扬亲自化身为陪跑主播","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500870225b0adbbd6a491d9c12afcab80b4f71df2.jpg","type_id":"http://music.baidu.com/h5pc/spec_detail?id=533&columnid=132","type":4,"title":"刘力扬亲自化身为陪跑主播：华语乐享动特别节目","tip_type":0,"author":""},{"desc":"百度音乐高清直播《王道音乐》 | 0715期","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_15000331674dcd150a097324777e5f0e1cd9c986a3.jpg","type_id":"http://music.baidu.com/cms/webview/topic_activity/wantmusic0715/","type":4,"title":"易家扬：从虚拟歌姬洛天依聊虚拟偶像的破壁之路","tip_type":0,"author":""},{"desc":"百度音乐独家DJ节目《有待咖啡》 | 第46期","pic":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_15005352877973449459cc605c7f44c3f53abfb481.jpg","type_id":"http://music.baidu.com/h5pc/spec_detail?id=531&columnid=89","type":4,"title":"为什么顶尖级爵士&灵魂乐大师都争相与他合作？","tip_type":0,"author":""}]
             */

            private int error_code;
            private List<ResultBeanXXXXXXXXXXXXXXXXX> result;

            public int getError_code() {
                return error_code;
            }

            public void setError_code(int error_code) {
                this.error_code = error_code;
            }

            public List<ResultBeanXXXXXXXXXXXXXXXXX> getResult() {
                return result;
            }

            public void setResult(List<ResultBeanXXXXXXXXXXXXXXXXX> result) {
                this.result = result;
            }

            public static class ResultBeanXXXXXXXXXXXXXXXXX {
                /**
                 * desc : 一周音乐热 | 网罗一周乐坛动态！
                 * pic : http://business.cdn.qianqian.com/qianqian/pic/bos_client_1500978694e26f17f289cdfe7fc03c694d98e7eab2.jpg
                 * type_id : http://music.baidu.com/h5pc/spec_detail?id=543&columnid=87
                 * type : 4
                 * title : MUSICHOT87 | 关于Linkin Park最后的纪念
                 * tip_type : 0
                 * author :
                 */

                private String desc;
                private String pic;
                private String type_id;
                private int type;
                private String title;
                private int tip_type;
                private String author;

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getTip_type() {
                    return tip_type;
                }

                public void setTip_type(int tip_type) {
                    this.tip_type = tip_type;
                }

                public String getAuthor() {
                    return author;
                }

                public void setAuthor(String author) {
                    this.author = author;
                }
            }
        }
    }

    public static class ModuleBean {
        /**
         * id : 25
         * style : 1
         * link_url :
         * style_nums : 0
         * pos : 1
         * title : 焦点图
         * key : focus
         * picurl :
         * title_more :
         * nums : 8
         * jump :
         */

        private String id;
        private int style;
        private String link_url;
        private String style_nums;
        private int pos;
        private String title;
        private String key;
        private String picurl;
        private String title_more;
        private int nums;
        private String jump;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getStyle() {
            return style;
        }

        public void setStyle(int style) {
            this.style = style;
        }

        public String getLink_url() {
            return link_url;
        }

        public void setLink_url(String link_url) {
            this.link_url = link_url;
        }

        public String getStyle_nums() {
            return style_nums;
        }

        public void setStyle_nums(String style_nums) {
            this.style_nums = style_nums;
        }

        public int getPos() {
            return pos;
        }

        public void setPos(int pos) {
            this.pos = pos;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getPicurl() {
            return picurl;
        }

        public void setPicurl(String picurl) {
            this.picurl = picurl;
        }

        public String getTitle_more() {
            return title_more;
        }

        public void setTitle_more(String title_more) {
            this.title_more = title_more;
        }

        public int getNums() {
            return nums;
        }

        public void setNums(int nums) {
            this.nums = nums;
        }

        public String getJump() {
            return jump;
        }

        public void setJump(String jump) {
            this.jump = jump;
        }
    }
}

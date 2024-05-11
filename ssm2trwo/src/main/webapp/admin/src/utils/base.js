const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm2trwo/",
            name: "ssm2trwo",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm2trwo/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "微信小程序线上教育商城"
        } 
    }
}
export default base

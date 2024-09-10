const base = {
    get() {
                return {
            url : "http://localhost:8080/ssm64ii2/",
            name: "ssm64ii2",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm64ii2/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "篮球论坛平台"
        } 
    }
}
export default base

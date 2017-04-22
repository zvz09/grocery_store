var app = angular.module("csdnblogListApp", []);
app.factory("csdnblogListService",["$http",function(http){
    return {
        getList: function(param,callback){
            http.post( "/grocery_store/csdnblog/list",param)
                .success(function(result) {
                    callback(result);
                });
        }
    };
}]);
app.controller('csdnblogListCtrl',["$scope","csdnblogListService","$filter",function (scope,csdnblogListService,$filter) {
    scope.keyword = '';
    scope.init = function () {
        scope.contextLists =[];
        scope.pageNum = 1;
        scope.pageSize = 2;
        scope.noMoreData = false;
    }
    /**
     * 点击加载更多
     */
    scope.nextList=function(){
        scope.pageNum = scope.pageNum+1;
        scope.getList();
    }
    /**
     * 查询
     */
    scope.search = function () {
        scope.init();
        scope.getList();
    }

    scope.getList=function(){
        var param = {
            "page":scope.pageNum,
            "limit":scope.pageSize,
            "keyword":scope.keyword
        };
        csdnblogListService.getList(param,function(result){
            if(result.code!=0){//异常
                layer.msg('网络异常!',{"time":1000});
            }else{
                scope.contextLists = scope.contextLists.concat(result.page.list);//合并数组
                if(result.page.totalPage<= scope.pageNum){
                    scope.noMoreData = false;//隐藏加载更多按钮
                }else{
                    scope.noMoreData = true;//显示加载更多按钮
                }
            }

        })
    }

    scope.init();
    scope.getList();


}]);












var app = angular.module("csdnblogListApp", []);
app.factory("csdnblogListService",["$http",function(http){
    return {
        getList: function(param,callback){
            http.get( "/grocery_store/csdnblog/list?"+param)
                .success(function(result) {
                    callback(result);
                });
        }
    };
}]);
app.controller('csdnblogListCtrl',["$scope","csdnblogListService","$filter",function (scope,csdnblogListService,$filter) {
    scope.contextLists =[];
    scope.pageNum = 1;
    scope.pageSize = 8;
    scope.noMoreData = false;
    /**
     * 点击加载更多
     */
    scope.nextList=function(){
        scope.pageNum = scope.pageNum+1;
        scope.getList(scope.pigType);
    }


    scope.getList=function(){
        var param = "page="+scope.pageNum+"&limit="+scope.pageSize;
        csdnblogListService.getList(param,function(result){
            console.log(result.page.list);
            if(result.code!=0){//异常
                layer.msg('网络异常!',{"time":1000});
            }else if(result.page.totalPage<= scope.pageNum){
                scope.contextLists = scope.contextLists.concat(result.page.list);//合并数组
                scope.noMoreData = false;//隐藏加载更多按钮
            }else{
                scope.contextLists = scope.contextLists.concat(result.page.list);//合并数组
                if( result.page.totalPage > scope.pageNum){
                    scope.noMoreData = true;//显示加载更多按钮
                }
            }

        })
    }

    scope.getList();


}]);












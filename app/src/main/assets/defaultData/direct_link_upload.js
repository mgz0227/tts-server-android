let DirectUploadJS = {

    "喵公子 (有效期7天)": function(config) {
        let url = 'https://sy.mgz6.cc/shuyuan'
        let resp = upload(url, config)
        let result = JSON.parse(resp.body().string())
        if (result['msg'] !== 'success') {
            throw "error: " + result['msg']
        }

        return url + '/' + result['data']
    }
,
"橘途网盘 (永久有效·速度较慢，如非需要永久连接，否则不建议)": function(config) {
    let resp = upload('http://v2.jt12.de/up-v2.php', config)
    let str = resp.body().string()
    let result = JSON.parse(str)
    if (result['code'] !== 0) {
        throw "error: " + result['msg']
    }

    return result['msg']
}

}

function upload(url, config, extra) {
    let form = {
        "file":{
            'body': config,
            'fileName': 'config.json',
            'contentType': 'application/json',
          }
    }

    return ttsrv.httpPostMultipart(url, form)
}

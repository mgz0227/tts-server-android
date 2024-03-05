let DirectUploadJS = {

    "喵公子① (有效期7天)": function(config) {
        let url = 'https://sy.mgz6.cc/shuyuan'
        let zl = 'https://shuyuan.mgz6.cc/shuyuan'
        let resp = upload(url, config)
        let result = JSON.parse(resp.body().string())
        if (result['msg'] !== 'success') {
            throw "error: " + result['msg']
        }

        return zl + '/' + result['data']
    }
,
"喵公子②·备用 (有效期7天)": function(config) {
    let url = 'https://sy.miaogongzi.cc/shuyuan'
    let zl = 'https://shuyuan.miaogongzi.cc/shuyuan'
    let resp = upload(url, config)
    let result = JSON.parse(resp.body().string())
    if (result['msg'] !== 'success') {
        throw "error: " + result['msg']
    }

    return zl + '/' + result['data']
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

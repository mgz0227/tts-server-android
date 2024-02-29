let DirectUploadJS = {


    "喵公子 (有效期7天)": function(config) {
        let url = 'https://sy.mgz6.cc/shuyuan'
        let down = 'https://shuyuan.mgz6.cc/shuyuan'
        let resp = upload(url, config)
        let result = JSON.parse(resp.body().string())
        if (result['msg'] !== 'success') {
            throw "error: " + result['msg']
        }

        return down + '/' + result['data']
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

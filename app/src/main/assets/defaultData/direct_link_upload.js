let DirectUploadJS = {
<<<<<<< HEAD
    "橘途网盘 (永久有效)": function(config) {
        let resp = upload('http://v2.jt12.de/up-v2.php', config)
        let str = resp.body().string()
        let result = JSON.parse(str)
        if (result['code'] !== 0) {
            throw "error: " + result['msg']
        }

        return result['msg']
    },

    "喵公子 (有效期2天)": function(config) {
        let url = 'https://sy.mgz6.cc/shuyuan'
=======


    "喵公子 (有效期7天)": function(config) {
        let url = 'https://sy.mgz6.cc/shuyuan'
        let down = 'https://shuyuan.mgz6.cc/shuyuan'
>>>>>>> parent of e4afa4a2 (回退)
        let resp = upload(url, config)
        let result = JSON.parse(resp.body().string())
        if (result['msg'] !== 'success') {
            throw "error: " + result['msg']
        }

<<<<<<< HEAD
        return url + '/' + result['data']
    },

    "Catbox (有效期未知)": function(config) {
        let form = {
            'fileToUpload': {
                'body': config,
                'fileName': "config.json",
                'contentType': "application/json"
            },
            'reqtype': 'fileupload',
        }
        let resp = ttsrv.httpPostMultipart('https://catbox.moe/user/api.php', form)
        if (resp.code() !== 200) {
            throw 'error: HTTP-' + resp.code()
        }

        return resp.body().string()
=======
        return down + '/' + result['data']
>>>>>>> parent of e4afa4a2 (回退)
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

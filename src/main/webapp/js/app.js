var appKey = 'shimo-sdk-test-key';

if (!window.Shimo) {
  alert('SDK javascript 文件加载失败');
}

var Editor = new Shimo({
  appId: appKey,
  user: window.user,
  signUrl: '/sign'
});

var showFile = function (file) {
  $('#header .title').text(file.name);
  document.title = file.name;
  Editor.start({
    containerId: 'editor-container',
    guid: file.guid,
    type: file.type
  });
};

$(function () {
  function createFile(type) {
    var name = prompt('请输入标题', '无标题');
    if (!name) {
      return;
    }

    Editor.create({
      name: name,
      type: type,
    }).then(function (file) {
      $.post('/store', {
        guid: file.guid,
        name: file.name,
        type: file.type,
        user: window.user.name
      }, function () {
        location.href = '/file.jsp?guid=' + file.guid;
      });
    });
  }

  $('#create-doc').click(function () {
    createFile('document');
  });

  $('#create-sheet').click(function () {
    createFile('spreadsheet');
  });
});

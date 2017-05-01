$(function () {
  Editor.fetch(window.guid).then(showFile);

  var status = $('#header .status');
  Editor.on('saveStatus', function (msg) {
    status.text(msg.displayText);
  })
});

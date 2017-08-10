$(document).ready(function() {
  // get current URL path and assign 'active' class
  var pathname = window.location.pathname;
  var selector = '.navbar div div a.navbar-btn[href="PATHNAME"]';
  switch (pathname) {
    case '/people.html':
      $(selector.replace('PATHNAME','/people.html')).addClass('active');
      break;
    default:
      $(selector.replace('PATHNAME','/')).addClass('active');
  }
})

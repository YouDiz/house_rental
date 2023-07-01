const submitCommentButton = document.getElementById("submit-comment");
const commentsList = document.getElementById("comments-list");

submitCommentButton.addEventListener("click", () => {
    const commentInput = document.getElementById("comment-input");
    const commentText = commentInput.value.trim();

    if (commentText) {
        const commentElement = document.createElement("div");
        commentElement.classList.add("comment");

        const commentContent= document.createElement("p");
        commentContent.innerHTML = `<strong>匿名用户：</strong>${commentText}`;
        commentElement.appendChild(commentContent);

        commentsList.appendChild(commentElement);
        commentInput.value = "";
    } else {
        alert("请输入留言内容！");
    }
});
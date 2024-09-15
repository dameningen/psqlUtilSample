import { restGet } from '../common/restClient';

// 集計結果取得API
const MT_NOTE_COUNT_API = "/api/mtnotecount";
// 全件取得API
const FIND_ALL_API = "/api/findall";

// コメント集計結果取得API
const COMMENT_COUNT_API = "/api/comment/getcount";
// コメントTBLデータ全件取得API
const COMMENT_FIND_ALL_API = "/api/comment/findall";


/**
 * 集計結果取得APIをコールする処理。
 */
export const callMtNoteCountList = () => {
    const url = MT_NOTE_COUNT_API;
    return restGet(url);
}

/**
 * 全件取得APIをコールする処理。
 * @param {*} accountId アカウントID
 */
export const callFindAll = () => {
    const url = FIND_ALL_API;
    return restGet(url);
}

/**
 * 集計結果取得APIをコールする処理。
 */
export const callCommentCountList = () => {
    const url = COMMENT_COUNT_API;
    return restGet(url);
}

/**
 * 全件取得APIをコールする処理。
 * @param {*} accountId アカウントID
 */
export const callCommentFindAll = () => {
    const url = COMMENT_FIND_ALL_API;
    return restGet(url);
}


/**
 * TODO
 * @param {*} accountId アカウントID
 */
export const callGetAccount = (accountId) => {
    const url = FIND_ALL_API + '/' + accountId;
    return restGet(url);
}
